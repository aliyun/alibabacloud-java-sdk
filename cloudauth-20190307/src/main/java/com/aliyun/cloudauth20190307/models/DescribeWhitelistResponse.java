// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWhitelistResponseBody body;

    public static DescribeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistResponse self = new DescribeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhitelistResponse setBody(DescribeWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhitelistResponseBody getBody() {
        return this.body;
    }

}
