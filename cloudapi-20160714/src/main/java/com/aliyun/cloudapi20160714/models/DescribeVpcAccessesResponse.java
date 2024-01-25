// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcAccessesResponseBody body;

    public static DescribeVpcAccessesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAccessesResponse self = new DescribeVpcAccessesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAccessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcAccessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcAccessesResponse setBody(DescribeVpcAccessesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcAccessesResponseBody getBody() {
        return this.body;
    }

}
