// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpInventoryConstituteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGwpInventoryConstituteResponseBody body;

    public static GetGwpInventoryConstituteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGwpInventoryConstituteResponse self = new GetGwpInventoryConstituteResponse();
        return TeaModel.build(map, self);
    }

    public GetGwpInventoryConstituteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGwpInventoryConstituteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGwpInventoryConstituteResponse setBody(GetGwpInventoryConstituteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGwpInventoryConstituteResponseBody getBody() {
        return this.body;
    }

}
