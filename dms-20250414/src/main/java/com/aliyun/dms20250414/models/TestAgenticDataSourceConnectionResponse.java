// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class TestAgenticDataSourceConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestAgenticDataSourceConnectionResponseBody body;

    public static TestAgenticDataSourceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAgenticDataSourceConnectionResponse self = new TestAgenticDataSourceConnectionResponse();
        return TeaModel.build(map, self);
    }

    public TestAgenticDataSourceConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestAgenticDataSourceConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestAgenticDataSourceConnectionResponse setBody(TestAgenticDataSourceConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public TestAgenticDataSourceConnectionResponseBody getBody() {
        return this.body;
    }

}
