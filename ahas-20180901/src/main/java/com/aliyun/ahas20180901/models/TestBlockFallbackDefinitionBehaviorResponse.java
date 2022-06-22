// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class TestBlockFallbackDefinitionBehaviorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestBlockFallbackDefinitionBehaviorResponseBody body;

    public static TestBlockFallbackDefinitionBehaviorResponse build(java.util.Map<String, ?> map) throws Exception {
        TestBlockFallbackDefinitionBehaviorResponse self = new TestBlockFallbackDefinitionBehaviorResponse();
        return TeaModel.build(map, self);
    }

    public TestBlockFallbackDefinitionBehaviorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestBlockFallbackDefinitionBehaviorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestBlockFallbackDefinitionBehaviorResponse setBody(TestBlockFallbackDefinitionBehaviorResponseBody body) {
        this.body = body;
        return this;
    }
    public TestBlockFallbackDefinitionBehaviorResponseBody getBody() {
        return this.body;
    }

}
