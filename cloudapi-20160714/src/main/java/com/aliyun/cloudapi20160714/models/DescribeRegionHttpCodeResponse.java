// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionHttpCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionHttpCodeResponseBody body;

    public static DescribeRegionHttpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionHttpCodeResponse self = new DescribeRegionHttpCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionHttpCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionHttpCodeResponse setBody(DescribeRegionHttpCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionHttpCodeResponseBody getBody() {
        return this.body;
    }

}
