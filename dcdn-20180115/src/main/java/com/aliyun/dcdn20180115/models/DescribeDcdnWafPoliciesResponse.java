// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnWafPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafPoliciesResponse setBody(DescribeDcdnWafPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPoliciesResponseBody getBody() {
        return this.body;
    }

}
