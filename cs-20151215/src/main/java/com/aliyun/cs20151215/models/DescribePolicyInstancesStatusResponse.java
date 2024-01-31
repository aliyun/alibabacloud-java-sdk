// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolicyInstancesStatusResponseBody body;

    public static DescribePolicyInstancesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesStatusResponse self = new DescribePolicyInstancesStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyInstancesStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolicyInstancesStatusResponse setBody(DescribePolicyInstancesStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyInstancesStatusResponseBody getBody() {
        return this.body;
    }

}
