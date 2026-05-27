// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TestLargeModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestLargeModelResponseBody body;

    public static TestLargeModelResponse build(java.util.Map<String, ?> map) throws Exception {
        TestLargeModelResponse self = new TestLargeModelResponse();
        return TeaModel.build(map, self);
    }

    public TestLargeModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestLargeModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestLargeModelResponse setBody(TestLargeModelResponseBody body) {
        this.body = body;
        return this;
    }
    public TestLargeModelResponseBody getBody() {
        return this.body;
    }

}
