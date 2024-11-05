// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnTypesResponseBody body;

    public static DescribeCdnTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnTypesResponse self = new DescribeCdnTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnTypesResponse setBody(DescribeCdnTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnTypesResponseBody getBody() {
        return this.body;
    }

}
