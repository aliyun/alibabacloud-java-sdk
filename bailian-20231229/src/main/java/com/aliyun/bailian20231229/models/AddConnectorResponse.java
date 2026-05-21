// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddConnectorResponseBody body;

    public static AddConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddConnectorResponse self = new AddConnectorResponse();
        return TeaModel.build(map, self);
    }

    public AddConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddConnectorResponse setBody(AddConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddConnectorResponseBody getBody() {
        return this.body;
    }

}
