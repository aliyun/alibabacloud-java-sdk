// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventSourceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestEventSourceConfigResponseBody body;

    public static TestEventSourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        TestEventSourceConfigResponse self = new TestEventSourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public TestEventSourceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestEventSourceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestEventSourceConfigResponse setBody(TestEventSourceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public TestEventSourceConfigResponseBody getBody() {
        return this.body;
    }

}
