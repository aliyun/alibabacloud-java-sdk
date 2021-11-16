// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyDetailsResponseBody body;

    public static DescribePolicyDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyDetailsResponse self = new DescribePolicyDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyDetailsResponse setBody(DescribePolicyDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyDetailsResponseBody getBody() {
        return this.body;
    }

}
