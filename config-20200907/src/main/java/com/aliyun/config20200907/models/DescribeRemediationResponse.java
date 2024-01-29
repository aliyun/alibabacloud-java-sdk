// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeRemediationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRemediationResponseBody body;

    public static DescribeRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRemediationResponse self = new DescribeRemediationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRemediationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRemediationResponse setBody(DescribeRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRemediationResponseBody getBody() {
        return this.body;
    }

}
