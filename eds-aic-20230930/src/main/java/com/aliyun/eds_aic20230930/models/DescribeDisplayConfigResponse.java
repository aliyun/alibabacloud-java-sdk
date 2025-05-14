// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeDisplayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDisplayConfigResponseBody body;

    public static DescribeDisplayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisplayConfigResponse self = new DescribeDisplayConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisplayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDisplayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDisplayConfigResponse setBody(DescribeDisplayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisplayConfigResponseBody getBody() {
        return this.body;
    }

}
