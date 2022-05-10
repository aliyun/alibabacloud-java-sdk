// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class TestPopParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestPopParamsResponseBody body;

    public static TestPopParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        TestPopParamsResponse self = new TestPopParamsResponse();
        return TeaModel.build(map, self);
    }

    public TestPopParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestPopParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestPopParamsResponse setBody(TestPopParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public TestPopParamsResponseBody getBody() {
        return this.body;
    }

}
