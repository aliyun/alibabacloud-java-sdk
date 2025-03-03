// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNetTestResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetTestResultResponseBody body;

    public static DescribeNetTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetTestResultResponse self = new DescribeNetTestResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetTestResultResponse setBody(DescribeNetTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetTestResultResponseBody getBody() {
        return this.body;
    }

}
