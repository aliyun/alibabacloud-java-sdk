// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEntityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEntityInfoResponseBody body;

    public static DescribeEntityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntityInfoResponse self = new DescribeEntityInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEntityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEntityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEntityInfoResponse setBody(DescribeEntityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEntityInfoResponseBody getBody() {
        return this.body;
    }

}
