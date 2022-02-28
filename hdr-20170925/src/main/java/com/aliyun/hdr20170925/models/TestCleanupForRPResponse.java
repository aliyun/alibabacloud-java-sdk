// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestCleanupForRPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestCleanupForRPResponseBody body;

    public static TestCleanupForRPResponse build(java.util.Map<String, ?> map) throws Exception {
        TestCleanupForRPResponse self = new TestCleanupForRPResponse();
        return TeaModel.build(map, self);
    }

    public TestCleanupForRPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestCleanupForRPResponse setBody(TestCleanupForRPResponseBody body) {
        this.body = body;
        return this;
    }
    public TestCleanupForRPResponseBody getBody() {
        return this.body;
    }

}
