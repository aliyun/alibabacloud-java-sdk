// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class QueryDedicatedBlockStorageClusterInventoryDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody body;

    public static QueryDedicatedBlockStorageClusterInventoryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDedicatedBlockStorageClusterInventoryDataResponse self = new QueryDedicatedBlockStorageClusterInventoryDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponse setBody(QueryDedicatedBlockStorageClusterInventoryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody getBody() {
        return this.body;
    }

}
