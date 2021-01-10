// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMediaTagResponseBody body;

    public static DeleteMediaTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaTagResponse self = new DeleteMediaTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaTagResponse setBody(DeleteMediaTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaTagResponseBody getBody() {
        return this.body;
    }

}
