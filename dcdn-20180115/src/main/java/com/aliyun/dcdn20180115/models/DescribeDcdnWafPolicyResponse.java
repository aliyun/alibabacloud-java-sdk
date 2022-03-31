// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnWafPolicyResponse setBody(DescribeDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
