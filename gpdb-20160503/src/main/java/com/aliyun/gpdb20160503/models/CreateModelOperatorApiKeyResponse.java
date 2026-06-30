// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateModelOperatorApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelOperatorApiKeyResponseBody body;

    public static CreateModelOperatorApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelOperatorApiKeyResponse self = new CreateModelOperatorApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelOperatorApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelOperatorApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelOperatorApiKeyResponse setBody(CreateModelOperatorApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelOperatorApiKeyResponseBody getBody() {
        return this.body;
    }

}
