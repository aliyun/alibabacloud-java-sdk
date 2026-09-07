// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulDesktopsResponseBody body;

    public static DescribeVulDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDesktopsResponse self = new DescribeVulDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulDesktopsResponse setBody(DescribeVulDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulDesktopsResponseBody getBody() {
        return this.body;
    }

}
