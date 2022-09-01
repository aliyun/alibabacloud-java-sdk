// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnL2VipsResponseBody body;

    public static DescribeDcdnL2VipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsResponse self = new DescribeDcdnL2VipsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnL2VipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnL2VipsResponse setBody(DescribeDcdnL2VipsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnL2VipsResponseBody getBody() {
        return this.body;
    }

}
