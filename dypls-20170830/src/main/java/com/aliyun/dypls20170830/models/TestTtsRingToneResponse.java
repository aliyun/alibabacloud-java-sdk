// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class TestTtsRingToneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestTtsRingToneResponseBody body;

    public static TestTtsRingToneResponse build(java.util.Map<String, ?> map) throws Exception {
        TestTtsRingToneResponse self = new TestTtsRingToneResponse();
        return TeaModel.build(map, self);
    }

    public TestTtsRingToneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestTtsRingToneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestTtsRingToneResponse setBody(TestTtsRingToneResponseBody body) {
        this.body = body;
        return this;
    }
    public TestTtsRingToneResponseBody getBody() {
        return this.body;
    }

}
