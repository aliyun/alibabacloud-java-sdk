// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBucketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBucketsResponseBody body;

    public static DescribeBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBucketsResponse self = new DescribeBucketsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBucketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBucketsResponse setBody(DescribeBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBucketsResponseBody getBody() {
        return this.body;
    }

}
