// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveSynonymResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSynonymResponseBody body;

    public static RemoveSynonymResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSynonymResponse self = new RemoveSynonymResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSynonymResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSynonymResponse setBody(RemoveSynonymResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSynonymResponseBody getBody() {
        return this.body;
    }

}
