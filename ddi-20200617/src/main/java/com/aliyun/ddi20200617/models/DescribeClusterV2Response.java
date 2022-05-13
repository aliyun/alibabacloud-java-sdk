// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeClusterV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterV2ResponseBody body;

    public static DescribeClusterV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2Response self = new DescribeClusterV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeClusterV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterV2Response setBody(DescribeClusterV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterV2ResponseBody getBody() {
        return this.body;
    }

}
