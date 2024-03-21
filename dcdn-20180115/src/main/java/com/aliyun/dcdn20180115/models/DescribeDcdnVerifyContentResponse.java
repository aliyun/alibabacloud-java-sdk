// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnVerifyContentResponseBody body;

    public static DescribeDcdnVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnVerifyContentResponse self = new DescribeDcdnVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnVerifyContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnVerifyContentResponse setBody(DescribeDcdnVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnVerifyContentResponseBody getBody() {
        return this.body;
    }

}
