// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagKeyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTagKeyListResponseBody body;

    public static DescribeTagKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeyListResponse self = new DescribeTagKeyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagKeyListResponse setBody(DescribeTagKeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagKeyListResponseBody getBody() {
        return this.body;
    }

}
