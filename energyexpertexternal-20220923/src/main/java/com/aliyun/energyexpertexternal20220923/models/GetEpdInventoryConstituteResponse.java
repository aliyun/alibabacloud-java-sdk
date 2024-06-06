// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEpdInventoryConstituteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEpdInventoryConstituteResponseBody body;

    public static GetEpdInventoryConstituteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEpdInventoryConstituteResponse self = new GetEpdInventoryConstituteResponse();
        return TeaModel.build(map, self);
    }

    public GetEpdInventoryConstituteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEpdInventoryConstituteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEpdInventoryConstituteResponse setBody(GetEpdInventoryConstituteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEpdInventoryConstituteResponseBody getBody() {
        return this.body;
    }

}
