// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class TestGrayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestGrayResponseBody body;

    public static TestGrayResponse build(java.util.Map<String, ?> map) throws Exception {
        TestGrayResponse self = new TestGrayResponse();
        return TeaModel.build(map, self);
    }

    public TestGrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestGrayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestGrayResponse setBody(TestGrayResponseBody body) {
        this.body = body;
        return this;
    }
    public TestGrayResponseBody getBody() {
        return this.body;
    }

}
