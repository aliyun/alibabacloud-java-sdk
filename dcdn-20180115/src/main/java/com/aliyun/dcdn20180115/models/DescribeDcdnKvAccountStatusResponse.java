// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvAccountStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnKvAccountStatusResponseBody body;

    public static DescribeDcdnKvAccountStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvAccountStatusResponse self = new DescribeDcdnKvAccountStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvAccountStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnKvAccountStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnKvAccountStatusResponse setBody(DescribeDcdnKvAccountStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnKvAccountStatusResponseBody getBody() {
        return this.body;
    }

}
