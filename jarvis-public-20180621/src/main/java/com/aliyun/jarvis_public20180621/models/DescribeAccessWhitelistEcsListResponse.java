// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAccessWhitelistEcsListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessWhitelistEcsListResponseBody body;

    public static DescribeAccessWhitelistEcsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessWhitelistEcsListResponse self = new DescribeAccessWhitelistEcsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessWhitelistEcsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessWhitelistEcsListResponse setBody(DescribeAccessWhitelistEcsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessWhitelistEcsListResponseBody getBody() {
        return this.body;
    }

}
