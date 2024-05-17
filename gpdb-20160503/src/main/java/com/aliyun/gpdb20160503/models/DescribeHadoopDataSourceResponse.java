// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHadoopDataSourceResponseBody body;

    public static DescribeHadoopDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopDataSourceResponse self = new DescribeHadoopDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHadoopDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHadoopDataSourceResponse setBody(DescribeHadoopDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHadoopDataSourceResponseBody getBody() {
        return this.body;
    }

}
