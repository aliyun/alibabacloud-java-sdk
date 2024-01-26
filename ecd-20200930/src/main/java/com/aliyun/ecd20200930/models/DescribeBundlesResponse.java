// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBundlesResponseBody body;

    public static DescribeBundlesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBundlesResponse self = new DescribeBundlesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBundlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBundlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBundlesResponse setBody(DescribeBundlesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBundlesResponseBody getBody() {
        return this.body;
    }

}
