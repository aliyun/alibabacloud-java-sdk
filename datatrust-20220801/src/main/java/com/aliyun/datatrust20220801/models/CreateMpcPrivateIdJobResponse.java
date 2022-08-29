// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateMpcPrivateIdJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMpcPrivateIdJobResponseBody body;

    public static CreateMpcPrivateIdJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMpcPrivateIdJobResponse self = new CreateMpcPrivateIdJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateMpcPrivateIdJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMpcPrivateIdJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMpcPrivateIdJobResponse setBody(CreateMpcPrivateIdJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMpcPrivateIdJobResponseBody getBody() {
        return this.body;
    }

}
