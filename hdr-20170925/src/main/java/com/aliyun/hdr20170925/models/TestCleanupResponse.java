// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestCleanupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestCleanupResponseBody body;

    public static TestCleanupResponse build(java.util.Map<String, ?> map) throws Exception {
        TestCleanupResponse self = new TestCleanupResponse();
        return TeaModel.build(map, self);
    }

    public TestCleanupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestCleanupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestCleanupResponse setBody(TestCleanupResponseBody body) {
        this.body = body;
        return this;
    }
    public TestCleanupResponseBody getBody() {
        return this.body;
    }

}
