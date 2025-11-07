// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySearchPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifySearchPageListResponseBody body;

    public static DescribeVerifySearchPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySearchPageListResponse self = new DescribeVerifySearchPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySearchPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifySearchPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifySearchPageListResponse setBody(DescribeVerifySearchPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifySearchPageListResponseBody getBody() {
        return this.body;
    }

}
