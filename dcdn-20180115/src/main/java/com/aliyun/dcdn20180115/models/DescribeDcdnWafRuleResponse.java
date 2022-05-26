// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafRuleResponseBody body;

    public static DescribeDcdnWafRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafRuleResponse self = new DescribeDcdnWafRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafRuleResponse setBody(DescribeDcdnWafRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafRuleResponseBody getBody() {
        return this.body;
    }

}
