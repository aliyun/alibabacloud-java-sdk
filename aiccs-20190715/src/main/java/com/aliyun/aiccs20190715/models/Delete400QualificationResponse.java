// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Delete400QualificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Delete400QualificationResponseBody body;

    public static Delete400QualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        Delete400QualificationResponse self = new Delete400QualificationResponse();
        return TeaModel.build(map, self);
    }

    public Delete400QualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Delete400QualificationResponse setBody(Delete400QualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public Delete400QualificationResponseBody getBody() {
        return this.body;
    }

}
