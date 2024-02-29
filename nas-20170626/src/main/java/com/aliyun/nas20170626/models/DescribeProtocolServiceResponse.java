// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProtocolServiceResponseBody body;

    public static DescribeProtocolServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtocolServiceResponse self = new DescribeProtocolServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProtocolServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProtocolServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProtocolServiceResponse setBody(DescribeProtocolServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtocolServiceResponseBody getBody() {
        return this.body;
    }

}
