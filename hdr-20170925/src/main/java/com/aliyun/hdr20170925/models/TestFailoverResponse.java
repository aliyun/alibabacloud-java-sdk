// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestFailoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestFailoverResponseBody body;

    public static TestFailoverResponse build(java.util.Map<String, ?> map) throws Exception {
        TestFailoverResponse self = new TestFailoverResponse();
        return TeaModel.build(map, self);
    }

    public TestFailoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestFailoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestFailoverResponse setBody(TestFailoverResponseBody body) {
        this.body = body;
        return this;
    }
    public TestFailoverResponseBody getBody() {
        return this.body;
    }

}
