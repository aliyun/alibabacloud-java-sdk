// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveAIAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAIAppResponseBody body;

    public static RemoveAIAppResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAIAppResponse self = new RemoveAIAppResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAIAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAIAppResponse setBody(RemoveAIAppResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAIAppResponseBody getBody() {
        return this.body;
    }

}
