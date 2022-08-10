// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResumeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeInstanceResponseBody body;

    public static ResumeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeInstanceResponse self = new ResumeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeInstanceResponse setBody(ResumeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeInstanceResponseBody getBody() {
        return this.body;
    }

}
