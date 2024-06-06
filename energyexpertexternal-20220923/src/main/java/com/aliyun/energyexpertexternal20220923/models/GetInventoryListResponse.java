// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetInventoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInventoryListResponseBody body;

    public static GetInventoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryListResponse self = new GetInventoryListResponse();
        return TeaModel.build(map, self);
    }

    public GetInventoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInventoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInventoryListResponse setBody(GetInventoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInventoryListResponseBody getBody() {
        return this.body;
    }

}
