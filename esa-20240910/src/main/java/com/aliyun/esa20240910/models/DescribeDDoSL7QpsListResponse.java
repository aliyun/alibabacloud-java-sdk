// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSL7QpsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSL7QpsListResponseBody body;

    public static DescribeDDoSL7QpsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSL7QpsListResponse self = new DescribeDDoSL7QpsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSL7QpsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSL7QpsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSL7QpsListResponse setBody(DescribeDDoSL7QpsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSL7QpsListResponseBody getBody() {
        return this.body;
    }

}
