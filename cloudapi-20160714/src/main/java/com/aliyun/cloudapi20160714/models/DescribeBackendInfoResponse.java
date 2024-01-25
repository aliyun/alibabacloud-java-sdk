// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackendInfoResponseBody body;

    public static DescribeBackendInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendInfoResponse self = new DescribeBackendInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackendInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackendInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackendInfoResponse setBody(DescribeBackendInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackendInfoResponseBody getBody() {
        return this.body;
    }

}
