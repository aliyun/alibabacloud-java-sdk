// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnDeliverListResponseBody body;

    public static DescribeCdnDeliverListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeliverListResponse self = new DescribeCdnDeliverListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeliverListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDeliverListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDeliverListResponse setBody(DescribeCdnDeliverListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDeliverListResponseBody getBody() {
        return this.body;
    }

}
