// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyBindingsResponseBody body;

    public static DescribePolicyBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyBindingsResponse self = new DescribePolicyBindingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyBindingsResponse setBody(DescribePolicyBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyBindingsResponseBody getBody() {
        return this.body;
    }

}
