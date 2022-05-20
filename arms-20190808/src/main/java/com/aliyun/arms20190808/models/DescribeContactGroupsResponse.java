// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContactGroupsResponseBody body;

    public static DescribeContactGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupsResponse self = new DescribeContactGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContactGroupsResponse setBody(DescribeContactGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactGroupsResponseBody getBody() {
        return this.body;
    }

}
