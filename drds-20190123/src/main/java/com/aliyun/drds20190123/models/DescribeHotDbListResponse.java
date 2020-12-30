// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHotDbListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHotDbListResponseBody body;

    public static DescribeHotDbListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotDbListResponse self = new DescribeHotDbListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHotDbListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHotDbListResponse setBody(DescribeHotDbListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHotDbListResponseBody getBody() {
        return this.body;
    }

}
