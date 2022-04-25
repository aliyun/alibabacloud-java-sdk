// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class TestPutApiAndGetApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestPutApiAndGetApiResponseBody body;

    public static TestPutApiAndGetApiResponse build(java.util.Map<String, ?> map) throws Exception {
        TestPutApiAndGetApiResponse self = new TestPutApiAndGetApiResponse();
        return TeaModel.build(map, self);
    }

    public TestPutApiAndGetApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestPutApiAndGetApiResponse setBody(TestPutApiAndGetApiResponseBody body) {
        this.body = body;
        return this;
    }
    public TestPutApiAndGetApiResponseBody getBody() {
        return this.body;
    }

}
