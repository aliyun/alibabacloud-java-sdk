// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskDetailResponseBody body;

    public static DescribeTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskDetailResponse self = new DescribeTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskDetailResponse setBody(DescribeTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskDetailResponseBody getBody() {
        return this.body;
    }

}
