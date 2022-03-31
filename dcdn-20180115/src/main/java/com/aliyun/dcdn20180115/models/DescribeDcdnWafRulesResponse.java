// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnWafRulesResponse setBody(DescribeDcdnWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

}
