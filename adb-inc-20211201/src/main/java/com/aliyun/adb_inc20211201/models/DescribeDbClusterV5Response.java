// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterV5Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbClusterV5ResponseBody body;

    public static DescribeDbClusterV5Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterV5Response self = new DescribeDbClusterV5Response();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterV5Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbClusterV5Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbClusterV5Response setBody(DescribeDbClusterV5ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbClusterV5ResponseBody getBody() {
        return this.body;
    }

}
