// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetBoardCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetBoardCallbackResponseBody body;

    public static SetBoardCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBoardCallbackResponse self = new SetBoardCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SetBoardCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetBoardCallbackResponse setBody(SetBoardCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SetBoardCallbackResponseBody getBody() {
        return this.body;
    }

}
