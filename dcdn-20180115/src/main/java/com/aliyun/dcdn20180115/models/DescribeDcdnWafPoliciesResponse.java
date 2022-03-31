// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafPoliciesResponseBody body;

    public static DescribeDcdnWafPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPoliciesResponse self = new DescribeDcdnWafPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafPoliciesResponse setBody(DescribeDcdnWafPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPoliciesResponseBody getBody() {
        return this.body;
    }

}
