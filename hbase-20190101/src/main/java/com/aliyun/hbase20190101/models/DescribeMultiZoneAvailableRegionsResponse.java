// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMultiZoneAvailableRegionsResponseBody body;

    public static DescribeMultiZoneAvailableRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneAvailableRegionsResponse self = new DescribeMultiZoneAvailableRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneAvailableRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiZoneAvailableRegionsResponse setBody(DescribeMultiZoneAvailableRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiZoneAvailableRegionsResponseBody getBody() {
        return this.body;
    }

}
