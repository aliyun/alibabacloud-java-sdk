// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCdsFileShareLinksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdsFileShareLinksResponseBody body;

    public static DescribeCdsFileShareLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdsFileShareLinksResponse self = new DescribeCdsFileShareLinksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdsFileShareLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdsFileShareLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdsFileShareLinksResponse setBody(DescribeCdsFileShareLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdsFileShareLinksResponseBody getBody() {
        return this.body;
    }

}
