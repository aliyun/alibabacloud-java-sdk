// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsMaxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSBpsMaxResponseBody body;

    public static DescribeDDoSBpsMaxResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSBpsMaxResponse self = new DescribeDDoSBpsMaxResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSBpsMaxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSBpsMaxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSBpsMaxResponse setBody(DescribeDDoSBpsMaxResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSBpsMaxResponseBody getBody() {
        return this.body;
    }

}
