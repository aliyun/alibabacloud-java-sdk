// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class TestGetInstanceBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestGetInstanceBaseInfoResponseBody body;

    public static TestGetInstanceBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        TestGetInstanceBaseInfoResponse self = new TestGetInstanceBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public TestGetInstanceBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestGetInstanceBaseInfoResponse setBody(TestGetInstanceBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public TestGetInstanceBaseInfoResponseBody getBody() {
        return this.body;
    }

}
