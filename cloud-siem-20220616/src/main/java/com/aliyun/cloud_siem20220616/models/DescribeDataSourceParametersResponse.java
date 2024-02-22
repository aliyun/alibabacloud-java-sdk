// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSourceParametersResponseBody body;

    public static DescribeDataSourceParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceParametersResponse self = new DescribeDataSourceParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourceParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourceParametersResponse setBody(DescribeDataSourceParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourceParametersResponseBody getBody() {
        return this.body;
    }

}
