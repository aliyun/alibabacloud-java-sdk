// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHadoopConfigsResponseBody body;

    public static DescribeHadoopConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopConfigsResponse self = new DescribeHadoopConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHadoopConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHadoopConfigsResponse setBody(DescribeHadoopConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHadoopConfigsResponseBody getBody() {
        return this.body;
    }

}
