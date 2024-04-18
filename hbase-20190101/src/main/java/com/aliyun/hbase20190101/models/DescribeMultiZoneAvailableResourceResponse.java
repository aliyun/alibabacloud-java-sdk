// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultiZoneAvailableResourceResponseBody body;

    public static DescribeMultiZoneAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneAvailableResourceResponse self = new DescribeMultiZoneAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiZoneAvailableResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultiZoneAvailableResourceResponse setBody(DescribeMultiZoneAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiZoneAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
