// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventPatternResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestEventPatternResponseBody body;

    public static TestEventPatternResponse build(java.util.Map<String, ?> map) throws Exception {
        TestEventPatternResponse self = new TestEventPatternResponse();
        return TeaModel.build(map, self);
    }

    public TestEventPatternResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestEventPatternResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestEventPatternResponse setBody(TestEventPatternResponseBody body) {
        this.body = body;
        return this;
    }
    public TestEventPatternResponseBody getBody() {
        return this.body;
    }

}
