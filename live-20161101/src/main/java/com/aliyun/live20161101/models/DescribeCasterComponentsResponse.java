// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCasterComponentsResponseBody body;

    public static DescribeCasterComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterComponentsResponse self = new DescribeCasterComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCasterComponentsResponse setBody(DescribeCasterComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterComponentsResponseBody getBody() {
        return this.body;
    }

}
