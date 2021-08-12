// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePricingModuleResponseBody body;

    public static DescribePricingModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleResponse self = new DescribePricingModuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribePricingModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePricingModuleResponse setBody(DescribePricingModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePricingModuleResponseBody getBody() {
        return this.body;
    }

}
