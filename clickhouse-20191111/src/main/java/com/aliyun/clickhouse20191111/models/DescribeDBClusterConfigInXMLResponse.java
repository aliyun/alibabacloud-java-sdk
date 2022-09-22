// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigInXMLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterConfigInXMLResponseBody body;

    public static DescribeDBClusterConfigInXMLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigInXMLResponse self = new DescribeDBClusterConfigInXMLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigInXMLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterConfigInXMLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterConfigInXMLResponse setBody(DescribeDBClusterConfigInXMLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterConfigInXMLResponseBody getBody() {
        return this.body;
    }

}
