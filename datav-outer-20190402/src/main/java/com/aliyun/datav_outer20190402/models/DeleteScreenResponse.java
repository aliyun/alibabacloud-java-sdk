// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class DeleteScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScreenResponseBody body;

    public static DeleteScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScreenResponse self = new DeleteScreenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScreenResponse setBody(DeleteScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScreenResponseBody getBody() {
        return this.body;
    }

}
