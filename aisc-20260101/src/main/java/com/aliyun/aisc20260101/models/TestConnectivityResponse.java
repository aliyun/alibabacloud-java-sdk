// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class TestConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestConnectivityResponseBody body;

    public static TestConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        TestConnectivityResponse self = new TestConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public TestConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestConnectivityResponse setBody(TestConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public TestConnectivityResponseBody getBody() {
        return this.body;
    }

}
