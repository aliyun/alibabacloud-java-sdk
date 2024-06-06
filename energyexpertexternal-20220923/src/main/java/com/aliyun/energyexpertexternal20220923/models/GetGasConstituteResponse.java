// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGasConstituteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGasConstituteResponseBody body;

    public static GetGasConstituteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGasConstituteResponse self = new GetGasConstituteResponse();
        return TeaModel.build(map, self);
    }

    public GetGasConstituteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGasConstituteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGasConstituteResponse setBody(GetGasConstituteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGasConstituteResponseBody getBody() {
        return this.body;
    }

}
