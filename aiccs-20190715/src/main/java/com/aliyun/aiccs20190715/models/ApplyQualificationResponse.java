// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyQualificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyQualificationResponseBody body;

    public static ApplyQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyQualificationResponse self = new ApplyQualificationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyQualificationResponse setBody(ApplyQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyQualificationResponseBody getBody() {
        return this.body;
    }

}
