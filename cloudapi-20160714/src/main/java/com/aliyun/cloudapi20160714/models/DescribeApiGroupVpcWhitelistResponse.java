// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupVpcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiGroupVpcWhitelistResponseBody body;

    public static DescribeApiGroupVpcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupVpcWhitelistResponse self = new DescribeApiGroupVpcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupVpcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupVpcWhitelistResponse setBody(DescribeApiGroupVpcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupVpcWhitelistResponseBody getBody() {
        return this.body;
    }

}
