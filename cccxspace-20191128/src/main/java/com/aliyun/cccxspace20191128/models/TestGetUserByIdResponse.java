// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class TestGetUserByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestGetUserByIdResponseBody body;

    public static TestGetUserByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        TestGetUserByIdResponse self = new TestGetUserByIdResponse();
        return TeaModel.build(map, self);
    }

    public TestGetUserByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestGetUserByIdResponse setBody(TestGetUserByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public TestGetUserByIdResponseBody getBody() {
        return this.body;
    }

}
