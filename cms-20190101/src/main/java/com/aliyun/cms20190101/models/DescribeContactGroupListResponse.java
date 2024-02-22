// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContactGroupListResponseBody body;

    public static DescribeContactGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupListResponse self = new DescribeContactGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContactGroupListResponse setBody(DescribeContactGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactGroupListResponseBody getBody() {
        return this.body;
    }

}
