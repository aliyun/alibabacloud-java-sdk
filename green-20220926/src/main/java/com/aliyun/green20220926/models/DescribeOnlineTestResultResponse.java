// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOnlineTestResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOnlineTestResultResponseBody body;

    public static DescribeOnlineTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnlineTestResultResponse self = new DescribeOnlineTestResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnlineTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnlineTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnlineTestResultResponse setBody(DescribeOnlineTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnlineTestResultResponseBody getBody() {
        return this.body;
    }

}
