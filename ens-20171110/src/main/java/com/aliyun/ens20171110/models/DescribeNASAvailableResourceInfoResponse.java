// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNASAvailableResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNASAvailableResourceInfoResponseBody body;

    public static DescribeNASAvailableResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASAvailableResourceInfoResponse self = new DescribeNASAvailableResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNASAvailableResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNASAvailableResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNASAvailableResourceInfoResponse setBody(DescribeNASAvailableResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNASAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

}
