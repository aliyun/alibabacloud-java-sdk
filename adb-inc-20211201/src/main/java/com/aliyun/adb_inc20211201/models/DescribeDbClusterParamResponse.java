// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbClusterParamResponseBody body;

    public static DescribeDbClusterParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterParamResponse self = new DescribeDbClusterParamResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbClusterParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbClusterParamResponse setBody(DescribeDbClusterParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbClusterParamResponseBody getBody() {
        return this.body;
    }

}
