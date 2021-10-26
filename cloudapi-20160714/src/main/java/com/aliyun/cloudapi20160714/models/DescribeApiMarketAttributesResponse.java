// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiMarketAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiMarketAttributesResponseBody body;

    public static DescribeApiMarketAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMarketAttributesResponse self = new DescribeApiMarketAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiMarketAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiMarketAttributesResponse setBody(DescribeApiMarketAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiMarketAttributesResponseBody getBody() {
        return this.body;
    }

}
