// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBoardResponseBody body;

    public static UpdateBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardResponse self = new UpdateBoardResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBoardResponse setBody(UpdateBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBoardResponseBody getBody() {
        return this.body;
    }

}
