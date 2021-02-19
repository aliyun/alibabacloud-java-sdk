// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaiAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEaiAllResponseBody body;

    public static DeleteEaiAllResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaiAllResponse self = new DeleteEaiAllResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEaiAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEaiAllResponse setBody(DeleteEaiAllResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEaiAllResponseBody getBody() {
        return this.body;
    }

}
