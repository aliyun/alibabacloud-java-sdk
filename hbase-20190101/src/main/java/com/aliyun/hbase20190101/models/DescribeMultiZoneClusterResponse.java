// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultiZoneClusterResponseBody body;

    public static DescribeMultiZoneClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneClusterResponse self = new DescribeMultiZoneClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiZoneClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultiZoneClusterResponse setBody(DescribeMultiZoneClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

}
