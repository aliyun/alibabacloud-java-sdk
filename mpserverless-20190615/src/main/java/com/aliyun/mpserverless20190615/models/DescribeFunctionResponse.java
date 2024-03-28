// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFunctionResponseBody body;

    public static DescribeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFunctionResponse self = new DescribeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFunctionResponse setBody(DescribeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFunctionResponseBody getBody() {
        return this.body;
    }

}
