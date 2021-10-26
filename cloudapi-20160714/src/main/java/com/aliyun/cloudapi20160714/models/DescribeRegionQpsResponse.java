// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionQpsResponseBody body;

    public static DescribeRegionQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionQpsResponse self = new DescribeRegionQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionQpsResponse setBody(DescribeRegionQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionQpsResponseBody getBody() {
        return this.body;
    }

}
