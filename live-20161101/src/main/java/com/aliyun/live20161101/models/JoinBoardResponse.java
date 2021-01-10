// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinBoardResponseBody body;

    public static JoinBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinBoardResponse self = new JoinBoardResponse();
        return TeaModel.build(map, self);
    }

    public JoinBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinBoardResponse setBody(JoinBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinBoardResponseBody getBody() {
        return this.body;
    }

}
