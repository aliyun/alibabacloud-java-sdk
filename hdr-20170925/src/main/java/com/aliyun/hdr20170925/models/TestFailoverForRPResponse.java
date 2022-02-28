// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestFailoverForRPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestFailoverForRPResponseBody body;

    public static TestFailoverForRPResponse build(java.util.Map<String, ?> map) throws Exception {
        TestFailoverForRPResponse self = new TestFailoverForRPResponse();
        return TeaModel.build(map, self);
    }

    public TestFailoverForRPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestFailoverForRPResponse setBody(TestFailoverForRPResponseBody body) {
        this.body = body;
        return this;
    }
    public TestFailoverForRPResponseBody getBody() {
        return this.body;
    }

}
