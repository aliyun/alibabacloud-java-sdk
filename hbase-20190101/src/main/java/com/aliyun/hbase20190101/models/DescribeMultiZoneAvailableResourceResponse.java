// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMultiZoneAvailableResourceResponse setBody(DescribeMultiZoneAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiZoneAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
