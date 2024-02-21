// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnSubListResponseBody body;

    public static DescribeCdnSubListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSubListResponse self = new DescribeCdnSubListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSubListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnSubListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnSubListResponse setBody(DescribeCdnSubListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnSubListResponseBody getBody() {
        return this.body;
    }

}
