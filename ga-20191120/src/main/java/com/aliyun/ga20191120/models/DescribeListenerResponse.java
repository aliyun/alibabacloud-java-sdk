// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListenerResponseBody body;

    public static DescribeListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListenerResponse self = new DescribeListenerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListenerResponse setBody(DescribeListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListenerResponseBody getBody() {
        return this.body;
    }

}
