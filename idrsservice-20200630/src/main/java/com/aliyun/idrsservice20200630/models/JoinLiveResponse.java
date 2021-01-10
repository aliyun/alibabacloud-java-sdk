// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinLiveResponseBody body;

    public static JoinLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinLiveResponse self = new JoinLiveResponse();
        return TeaModel.build(map, self);
    }

    public JoinLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinLiveResponse setBody(JoinLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinLiveResponseBody getBody() {
        return this.body;
    }

}
