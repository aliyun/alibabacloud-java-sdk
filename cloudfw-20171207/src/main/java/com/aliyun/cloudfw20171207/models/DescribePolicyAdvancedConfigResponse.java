// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyAdvancedConfigResponseBody body;

    public static DescribePolicyAdvancedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyAdvancedConfigResponse self = new DescribePolicyAdvancedConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyAdvancedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyAdvancedConfigResponse setBody(DescribePolicyAdvancedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyAdvancedConfigResponseBody getBody() {
        return this.body;
    }

}
