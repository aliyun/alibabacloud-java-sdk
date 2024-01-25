// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeFcFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFcFunctionResponseBody body;

    public static DescribeFcFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFcFunctionResponse self = new DescribeFcFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFcFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFcFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFcFunctionResponse setBody(DescribeFcFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFcFunctionResponseBody getBody() {
        return this.body;
    }

}
