// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeRegionDdosThresholdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionDdosThresholdResponseBody body;

    public static DescribeRegionDdosThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionDdosThresholdResponse self = new DescribeRegionDdosThresholdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionDdosThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionDdosThresholdResponse setBody(DescribeRegionDdosThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionDdosThresholdResponseBody getBody() {
        return this.body;
    }

}
