// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBoardCallbackResponseBody body;

    public static UpdateBoardCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardCallbackResponse self = new UpdateBoardCallbackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBoardCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBoardCallbackResponse setBody(UpdateBoardCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBoardCallbackResponseBody getBody() {
        return this.body;
    }

}
