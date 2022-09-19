// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLakehouseValidResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLakehouseValidResourceGroupsResponseBody body;

    public static GetLakehouseValidResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLakehouseValidResourceGroupsResponse self = new GetLakehouseValidResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetLakehouseValidResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLakehouseValidResourceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLakehouseValidResourceGroupsResponse setBody(GetLakehouseValidResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLakehouseValidResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
