// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestDataServiceApiResponseBody body;

    public static TestDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        TestDataServiceApiResponse self = new TestDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public TestDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestDataServiceApiResponse setBody(TestDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public TestDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
