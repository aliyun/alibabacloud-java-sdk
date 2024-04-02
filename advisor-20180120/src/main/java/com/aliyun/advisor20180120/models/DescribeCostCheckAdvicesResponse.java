// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckAdvicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCostCheckAdvicesResponseBody body;

    public static DescribeCostCheckAdvicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckAdvicesResponse self = new DescribeCostCheckAdvicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckAdvicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCostCheckAdvicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCostCheckAdvicesResponse setBody(DescribeCostCheckAdvicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCostCheckAdvicesResponseBody getBody() {
        return this.body;
    }

}
