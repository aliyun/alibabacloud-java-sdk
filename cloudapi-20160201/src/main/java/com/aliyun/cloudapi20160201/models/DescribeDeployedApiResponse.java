// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeDeployedApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeployedApiResponseBody body;

    public static DescribeDeployedApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApiResponse self = new DescribeDeployedApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeployedApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeployedApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeployedApiResponse setBody(DescribeDeployedApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeployedApiResponseBody getBody() {
        return this.body;
    }

}
