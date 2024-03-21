// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDefaultRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafDefaultRulesResponseBody body;

    public static DescribeDcdnWafDefaultRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDefaultRulesResponse self = new DescribeDcdnWafDefaultRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDefaultRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafDefaultRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafDefaultRulesResponse setBody(DescribeDcdnWafDefaultRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafDefaultRulesResponseBody getBody() {
        return this.body;
    }

}
