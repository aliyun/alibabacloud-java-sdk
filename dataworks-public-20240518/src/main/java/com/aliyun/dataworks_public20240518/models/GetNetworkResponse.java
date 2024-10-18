// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkResponseBody body;

    public static GetNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkResponse self = new GetNetworkResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkResponse setBody(GetNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkResponseBody getBody() {
        return this.body;
    }

}
