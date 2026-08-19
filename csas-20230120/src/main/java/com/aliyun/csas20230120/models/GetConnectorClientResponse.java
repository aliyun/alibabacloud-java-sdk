// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetConnectorClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConnectorClientResponseBody body;

    public static GetConnectorClientResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectorClientResponse self = new GetConnectorClientResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectorClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectorClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConnectorClientResponse setBody(GetConnectorClientResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectorClientResponseBody getBody() {
        return this.body;
    }

}
