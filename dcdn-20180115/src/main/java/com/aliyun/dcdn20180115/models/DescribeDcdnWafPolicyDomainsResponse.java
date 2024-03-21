// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafPolicyDomainsResponseBody body;

    public static DescribeDcdnWafPolicyDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyDomainsResponse self = new DescribeDcdnWafPolicyDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafPolicyDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafPolicyDomainsResponse setBody(DescribeDcdnWafPolicyDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPolicyDomainsResponseBody getBody() {
        return this.body;
    }

}
