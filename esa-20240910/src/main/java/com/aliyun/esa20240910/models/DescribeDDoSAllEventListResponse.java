// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSAllEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSAllEventListResponseBody body;

    public static DescribeDDoSAllEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSAllEventListResponse self = new DescribeDDoSAllEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSAllEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSAllEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSAllEventListResponse setBody(DescribeDDoSAllEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSAllEventListResponseBody getBody() {
        return this.body;
    }

}
