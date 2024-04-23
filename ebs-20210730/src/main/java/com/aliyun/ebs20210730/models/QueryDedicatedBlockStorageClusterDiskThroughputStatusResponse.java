// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody body;

    public static QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse self = new QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse setBody(QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody getBody() {
        return this.body;
    }

}
