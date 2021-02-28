// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdatePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePerspectiveResponseBody body;

    public static UpdatePerspectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePerspectiveResponse self = new UpdatePerspectiveResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePerspectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePerspectiveResponse setBody(UpdatePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePerspectiveResponseBody getBody() {
        return this.body;
    }

}
