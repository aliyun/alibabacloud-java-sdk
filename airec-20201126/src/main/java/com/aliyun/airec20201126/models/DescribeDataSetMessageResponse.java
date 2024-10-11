// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeDataSetMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSetMessageResponseBody body;

    public static DescribeDataSetMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSetMessageResponse self = new DescribeDataSetMessageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSetMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSetMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSetMessageResponse setBody(DescribeDataSetMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSetMessageResponseBody getBody() {
        return this.body;
    }

}
