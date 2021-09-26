// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeLibraryDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLibraryDetailResponseBody body;

    public static DescribeLibraryDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryDetailResponse self = new DescribeLibraryDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLibraryDetailResponse setBody(DescribeLibraryDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLibraryDetailResponseBody getBody() {
        return this.body;
    }

}
