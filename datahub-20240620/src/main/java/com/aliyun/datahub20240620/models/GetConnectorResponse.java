// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConnectorResponseBody body;

    public static GetConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectorResponse self = new GetConnectorResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConnectorResponse setBody(GetConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectorResponseBody getBody() {
        return this.body;
    }

}
