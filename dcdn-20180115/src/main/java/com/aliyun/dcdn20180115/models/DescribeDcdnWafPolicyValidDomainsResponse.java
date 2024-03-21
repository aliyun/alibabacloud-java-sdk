// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyValidDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafPolicyValidDomainsResponseBody body;

    public static DescribeDcdnWafPolicyValidDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyValidDomainsResponse self = new DescribeDcdnWafPolicyValidDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyValidDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafPolicyValidDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafPolicyValidDomainsResponse setBody(DescribeDcdnWafPolicyValidDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPolicyValidDomainsResponseBody getBody() {
        return this.body;
    }

}
