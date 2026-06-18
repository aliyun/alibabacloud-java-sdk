// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateTokenPlanKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTokenPlanKeyResponseBody body;

    public static CreateTokenPlanKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenPlanKeyResponse self = new CreateTokenPlanKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTokenPlanKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTokenPlanKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTokenPlanKeyResponse setBody(CreateTokenPlanKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTokenPlanKeyResponseBody getBody() {
        return this.body;
    }

}
