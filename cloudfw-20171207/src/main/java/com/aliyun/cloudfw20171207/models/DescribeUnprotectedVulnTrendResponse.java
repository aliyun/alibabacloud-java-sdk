// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUnprotectedVulnTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUnprotectedVulnTrendResponseBody body;

    public static DescribeUnprotectedVulnTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnprotectedVulnTrendResponse self = new DescribeUnprotectedVulnTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnprotectedVulnTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnprotectedVulnTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUnprotectedVulnTrendResponse setBody(DescribeUnprotectedVulnTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnprotectedVulnTrendResponseBody getBody() {
        return this.body;
    }

}
