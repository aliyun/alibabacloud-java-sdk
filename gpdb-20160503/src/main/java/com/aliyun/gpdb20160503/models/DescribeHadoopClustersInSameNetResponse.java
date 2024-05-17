// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopClustersInSameNetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHadoopClustersInSameNetResponseBody body;

    public static DescribeHadoopClustersInSameNetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopClustersInSameNetResponse self = new DescribeHadoopClustersInSameNetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopClustersInSameNetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHadoopClustersInSameNetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHadoopClustersInSameNetResponse setBody(DescribeHadoopClustersInSameNetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHadoopClustersInSameNetResponseBody getBody() {
        return this.body;
    }

}
