// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnIpaStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserDcdnIpaStatusResponseBody body;

    public static DescribeUserDcdnIpaStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDcdnIpaStatusResponse self = new DescribeUserDcdnIpaStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserDcdnIpaStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserDcdnIpaStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserDcdnIpaStatusResponse setBody(DescribeUserDcdnIpaStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDcdnIpaStatusResponseBody getBody() {
        return this.body;
    }

}
