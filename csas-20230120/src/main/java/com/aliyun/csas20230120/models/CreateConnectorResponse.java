// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConnectorResponseBody body;

    public static CreateConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectorResponse self = new CreateConnectorResponse();
        return TeaModel.build(map, self);
    }

    public CreateConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConnectorResponse setBody(CreateConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConnectorResponseBody getBody() {
        return this.body;
    }

}
