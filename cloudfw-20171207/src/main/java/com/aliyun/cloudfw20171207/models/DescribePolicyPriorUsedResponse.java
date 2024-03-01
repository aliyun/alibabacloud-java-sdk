// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePolicyPriorUsedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyPriorUsedResponse setBody(DescribePolicyPriorUsedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyPriorUsedResponseBody getBody() {
        return this.body;
    }

}
