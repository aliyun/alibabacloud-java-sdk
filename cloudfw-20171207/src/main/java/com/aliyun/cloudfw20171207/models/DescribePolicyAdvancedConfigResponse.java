// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePolicyAdvancedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyAdvancedConfigResponse setBody(DescribePolicyAdvancedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyAdvancedConfigResponseBody getBody() {
        return this.body;
    }

}
