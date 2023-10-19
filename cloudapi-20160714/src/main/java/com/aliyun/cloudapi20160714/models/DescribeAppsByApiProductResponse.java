// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppsByApiProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppsByApiProductResponseBody body;

    public static DescribeAppsByApiProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsByApiProductResponse self = new DescribeAppsByApiProductResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppsByApiProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppsByApiProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppsByApiProductResponse setBody(DescribeAppsByApiProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppsByApiProductResponseBody getBody() {
        return this.body;
    }

}
