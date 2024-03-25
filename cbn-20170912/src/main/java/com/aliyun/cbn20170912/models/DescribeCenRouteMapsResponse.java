// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenRouteMapsResponseBody body;

    public static DescribeCenRouteMapsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsResponse self = new DescribeCenRouteMapsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenRouteMapsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenRouteMapsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenRouteMapsResponse setBody(DescribeCenRouteMapsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenRouteMapsResponseBody getBody() {
        return this.body;
    }

}
