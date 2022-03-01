// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class TestAnonymousResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestAnonymousResponseBody body;

    public static TestAnonymousResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAnonymousResponse self = new TestAnonymousResponse();
        return TeaModel.build(map, self);
    }

    public TestAnonymousResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestAnonymousResponse setBody(TestAnonymousResponseBody body) {
        this.body = body;
        return this;
    }
    public TestAnonymousResponseBody getBody() {
        return this.body;
    }

}
