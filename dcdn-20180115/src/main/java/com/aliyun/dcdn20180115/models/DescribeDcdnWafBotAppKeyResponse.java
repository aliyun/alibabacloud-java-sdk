// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafBotAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafBotAppKeyResponseBody body;

    public static DescribeDcdnWafBotAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafBotAppKeyResponse self = new DescribeDcdnWafBotAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafBotAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafBotAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafBotAppKeyResponse setBody(DescribeDcdnWafBotAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafBotAppKeyResponseBody getBody() {
        return this.body;
    }

}
