// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestSwitchResponseBody body;

    public static TestSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        TestSwitchResponse self = new TestSwitchResponse();
        return TeaModel.build(map, self);
    }

    public TestSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestSwitchResponse setBody(TestSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public TestSwitchResponseBody getBody() {
        return this.body;
    }

}
