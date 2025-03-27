// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TestDataSourceConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestDataSourceConnectivityResponseBody body;

    public static TestDataSourceConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        TestDataSourceConnectivityResponse self = new TestDataSourceConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public TestDataSourceConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestDataSourceConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestDataSourceConnectivityResponse setBody(TestDataSourceConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public TestDataSourceConnectivityResponseBody getBody() {
        return this.body;
    }

}
