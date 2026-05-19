// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnTaskListResponseBody body;

    public static DescribeCdnTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnTaskListResponse self = new DescribeCdnTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnTaskListResponse setBody(DescribeCdnTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnTaskListResponseBody getBody() {
        return this.body;
    }

}
