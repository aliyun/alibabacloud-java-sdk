// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMediaResponseBody body;

    public static DeleteMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaResponse self = new DeleteMediaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaResponse setBody(DeleteMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaResponseBody getBody() {
        return this.body;
    }

}
