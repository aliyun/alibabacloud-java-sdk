// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHotDbListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeHotDbListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHotDbListResponse setBody(DescribeHotDbListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHotDbListResponseBody getBody() {
        return this.body;
    }

}
