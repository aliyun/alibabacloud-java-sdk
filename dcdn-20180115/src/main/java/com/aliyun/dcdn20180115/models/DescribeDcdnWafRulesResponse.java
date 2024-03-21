// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafRulesResponseBody body;

    public static DescribeDcdnWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafRulesResponse self = new DescribeDcdnWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafRulesResponse setBody(DescribeDcdnWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

}
