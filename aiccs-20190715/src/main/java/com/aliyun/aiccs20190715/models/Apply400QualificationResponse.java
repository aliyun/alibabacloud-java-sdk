// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Apply400QualificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Apply400QualificationResponseBody body;

    public static Apply400QualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        Apply400QualificationResponse self = new Apply400QualificationResponse();
        return TeaModel.build(map, self);
    }

    public Apply400QualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Apply400QualificationResponse setBody(Apply400QualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public Apply400QualificationResponseBody getBody() {
        return this.body;
    }

}
