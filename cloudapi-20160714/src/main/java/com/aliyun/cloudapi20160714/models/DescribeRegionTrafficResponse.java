// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionTrafficResponseBody body;

    public static DescribeRegionTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionTrafficResponse self = new DescribeRegionTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionTrafficResponse setBody(DescribeRegionTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionTrafficResponseBody getBody() {
        return this.body;
    }

}
