// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateAIAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAIAppResponseBody body;

    public static UpdateAIAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAppResponse self = new UpdateAIAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAIAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAIAppResponse setBody(UpdateAIAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAIAppResponseBody getBody() {
        return this.body;
    }

}
