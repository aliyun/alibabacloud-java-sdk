// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ActivatePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivatePerspectiveResponseBody body;

    public static ActivatePerspectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivatePerspectiveResponse self = new ActivatePerspectiveResponse();
        return TeaModel.build(map, self);
    }

    public ActivatePerspectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivatePerspectiveResponse setBody(ActivatePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivatePerspectiveResponseBody getBody() {
        return this.body;
    }

}
