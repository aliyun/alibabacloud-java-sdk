// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveHttpsDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveHttpsDomainListResponseBody body;

    public static DescribeLiveHttpsDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveHttpsDomainListResponse self = new DescribeLiveHttpsDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveHttpsDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveHttpsDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveHttpsDomainListResponse setBody(DescribeLiveHttpsDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveHttpsDomainListResponseBody getBody() {
        return this.body;
    }

}
