// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaSearchPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetaSearchPageListResponseBody body;

    public static DescribeMetaSearchPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaSearchPageListResponse self = new DescribeMetaSearchPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetaSearchPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetaSearchPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetaSearchPageListResponse setBody(DescribeMetaSearchPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetaSearchPageListResponseBody getBody() {
        return this.body;
    }

}
