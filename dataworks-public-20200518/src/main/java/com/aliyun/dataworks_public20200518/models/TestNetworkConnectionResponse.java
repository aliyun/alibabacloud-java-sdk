// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestNetworkConnectionResponseBody body;

    public static TestNetworkConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        TestNetworkConnectionResponse self = new TestNetworkConnectionResponse();
        return TeaModel.build(map, self);
    }

    public TestNetworkConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestNetworkConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestNetworkConnectionResponse setBody(TestNetworkConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public TestNetworkConnectionResponseBody getBody() {
        return this.body;
    }

}
