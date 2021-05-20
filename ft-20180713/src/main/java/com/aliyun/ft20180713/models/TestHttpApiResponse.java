// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestHttpApiResponseBody body;

    public static TestHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        TestHttpApiResponse self = new TestHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public TestHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestHttpApiResponse setBody(TestHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public TestHttpApiResponseBody getBody() {
        return this.body;
    }

}
