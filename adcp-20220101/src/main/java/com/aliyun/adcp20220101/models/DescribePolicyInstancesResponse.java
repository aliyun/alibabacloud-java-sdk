// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyInstancesResponseBody body;

    public static DescribePolicyInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesResponse self = new DescribePolicyInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyInstancesResponse setBody(DescribePolicyInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyInstancesResponseBody getBody() {
        return this.body;
    }

}
