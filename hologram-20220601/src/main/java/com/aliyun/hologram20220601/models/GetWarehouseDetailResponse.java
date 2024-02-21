// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetWarehouseDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWarehouseDetailResponseBody body;

    public static GetWarehouseDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseDetailResponse self = new GetWarehouseDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetWarehouseDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWarehouseDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWarehouseDetailResponse setBody(GetWarehouseDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWarehouseDetailResponseBody getBody() {
        return this.body;
    }

}
