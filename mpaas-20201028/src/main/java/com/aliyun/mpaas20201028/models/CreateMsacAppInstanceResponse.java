// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMsacAppInstanceResponseBody body;

    public static CreateMsacAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacAppInstanceResponse self = new CreateMsacAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsacAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsacAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMsacAppInstanceResponse setBody(CreateMsacAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsacAppInstanceResponseBody getBody() {
        return this.body;
    }

}
