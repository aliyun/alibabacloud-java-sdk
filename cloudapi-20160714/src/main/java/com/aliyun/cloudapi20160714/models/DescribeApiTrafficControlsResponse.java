// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficControlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiTrafficControlsResponseBody body;

    public static DescribeApiTrafficControlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficControlsResponse self = new DescribeApiTrafficControlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficControlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiTrafficControlsResponse setBody(DescribeApiTrafficControlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiTrafficControlsResponseBody getBody() {
        return this.body;
    }

}
