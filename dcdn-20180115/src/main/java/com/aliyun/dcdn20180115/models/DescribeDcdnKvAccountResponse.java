// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnKvAccountResponseBody body;

    public static DescribeDcdnKvAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvAccountResponse self = new DescribeDcdnKvAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnKvAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnKvAccountResponse setBody(DescribeDcdnKvAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnKvAccountResponseBody getBody() {
        return this.body;
    }

}
