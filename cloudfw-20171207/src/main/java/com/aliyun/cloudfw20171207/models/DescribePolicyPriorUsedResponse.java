// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyPriorUsedResponseBody body;

    public static DescribePolicyPriorUsedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyPriorUsedResponse self = new DescribePolicyPriorUsedResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyPriorUsedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyPriorUsedResponse setBody(DescribePolicyPriorUsedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyPriorUsedResponseBody getBody() {
        return this.body;
    }

}
