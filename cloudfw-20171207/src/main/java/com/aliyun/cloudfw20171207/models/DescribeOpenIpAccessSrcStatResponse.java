// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOpenIpAccessSrcStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenIpAccessSrcStatResponseBody body;

    public static DescribeOpenIpAccessSrcStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenIpAccessSrcStatResponse self = new DescribeOpenIpAccessSrcStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenIpAccessSrcStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenIpAccessSrcStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenIpAccessSrcStatResponse setBody(DescribeOpenIpAccessSrcStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenIpAccessSrcStatResponseBody getBody() {
        return this.body;
    }

}
