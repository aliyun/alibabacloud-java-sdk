// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class TestTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestTestResponseBody body;

    public static TestTestResponse build(java.util.Map<String, ?> map) throws Exception {
        TestTestResponse self = new TestTestResponse();
        return TeaModel.build(map, self);
    }

    public TestTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestTestResponse setBody(TestTestResponseBody body) {
        this.body = body;
        return this;
    }
    public TestTestResponseBody getBody() {
        return this.body;
    }

}
