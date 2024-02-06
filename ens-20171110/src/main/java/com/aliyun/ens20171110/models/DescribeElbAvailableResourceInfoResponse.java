// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeElbAvailableResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElbAvailableResourceInfoResponseBody body;

    public static DescribeElbAvailableResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElbAvailableResourceInfoResponse self = new DescribeElbAvailableResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElbAvailableResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElbAvailableResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElbAvailableResourceInfoResponse setBody(DescribeElbAvailableResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElbAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

}
