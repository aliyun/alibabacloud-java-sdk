// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnConfigOfVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnConfigOfVersionResponseBody body;

    public static DescribeDcdnConfigOfVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnConfigOfVersionResponse self = new DescribeDcdnConfigOfVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnConfigOfVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnConfigOfVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnConfigOfVersionResponse setBody(DescribeDcdnConfigOfVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnConfigOfVersionResponseBody getBody() {
        return this.body;
    }

}
