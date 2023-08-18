// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ValidateJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateJobResponseBody body;

    public static ValidateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateJobResponse self = new ValidateJobResponse();
        return TeaModel.build(map, self);
    }

    public ValidateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateJobResponse setBody(ValidateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateJobResponseBody getBody() {
        return this.body;
    }

}
