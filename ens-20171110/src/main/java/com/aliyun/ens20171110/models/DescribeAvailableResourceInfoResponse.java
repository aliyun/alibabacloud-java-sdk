// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableResourceInfoResponseBody body;

    public static DescribeAvailableResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceInfoResponse self = new DescribeAvailableResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableResourceInfoResponse setBody(DescribeAvailableResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

}
