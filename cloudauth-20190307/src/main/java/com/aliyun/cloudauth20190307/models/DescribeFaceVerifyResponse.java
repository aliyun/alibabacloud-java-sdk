// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFaceVerifyResponseBody body;

    public static DescribeFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyResponse self = new DescribeFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaceVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaceVerifyResponse setBody(DescribeFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
