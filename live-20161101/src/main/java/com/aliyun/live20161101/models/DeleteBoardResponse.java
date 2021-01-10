// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBoardResponseBody body;

    public static DeleteBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBoardResponse self = new DeleteBoardResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBoardResponse setBody(DeleteBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBoardResponseBody getBody() {
        return this.body;
    }

}
