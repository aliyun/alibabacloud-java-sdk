// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePoliciesResponseBody body;

    public static DescribePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesResponse self = new DescribePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePoliciesResponse setBody(DescribePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePoliciesResponseBody getBody() {
        return this.body;
    }

}
