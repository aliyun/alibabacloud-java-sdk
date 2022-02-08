// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CheckCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCallbackResponseBody body;

    public static CheckCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCallbackResponse self = new CheckCallbackResponse();
        return TeaModel.build(map, self);
    }

    public CheckCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCallbackResponse setBody(CheckCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCallbackResponseBody getBody() {
        return this.body;
    }

}
