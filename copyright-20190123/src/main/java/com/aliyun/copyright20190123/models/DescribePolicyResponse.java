// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DescribePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyResponseBody body;

    public static DescribePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyResponse self = new DescribePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyResponse setBody(DescribePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyResponseBody getBody() {
        return this.body;
    }

}
