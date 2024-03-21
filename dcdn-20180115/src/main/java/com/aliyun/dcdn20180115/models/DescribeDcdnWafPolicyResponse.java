// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafPolicyResponseBody body;

    public static DescribeDcdnWafPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyResponse self = new DescribeDcdnWafPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafPolicyResponse setBody(DescribeDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
