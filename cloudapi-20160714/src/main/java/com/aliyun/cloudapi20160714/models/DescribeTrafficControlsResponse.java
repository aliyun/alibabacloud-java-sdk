// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTrafficControlsResponseBody body;

    public static DescribeTrafficControlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficControlsResponse self = new DescribeTrafficControlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficControlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrafficControlsResponse setBody(DescribeTrafficControlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrafficControlsResponseBody getBody() {
        return this.body;
    }

}
