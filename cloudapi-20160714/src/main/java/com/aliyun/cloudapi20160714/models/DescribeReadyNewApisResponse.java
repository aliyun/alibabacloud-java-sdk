// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeReadyNewApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReadyNewApisResponseBody body;

    public static DescribeReadyNewApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadyNewApisResponse self = new DescribeReadyNewApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReadyNewApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReadyNewApisResponse setBody(DescribeReadyNewApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReadyNewApisResponseBody getBody() {
        return this.body;
    }

}
