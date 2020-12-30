// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventResponseBody body;

    public static DeleteEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventResponse self = new DeleteEventResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventResponse setBody(DeleteEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventResponseBody getBody() {
        return this.body;
    }

}
