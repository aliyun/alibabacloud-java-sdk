// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTagValueListResponseBody body;

    public static DescribeTagValueListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValueListResponse self = new DescribeTagValueListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagValueListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagValueListResponse setBody(DescribeTagValueListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagValueListResponseBody getBody() {
        return this.body;
    }

}
