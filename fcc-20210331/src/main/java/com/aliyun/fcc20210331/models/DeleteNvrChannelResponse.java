// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteNvrChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNvrChannelResponseBody body;

    public static DeleteNvrChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNvrChannelResponse self = new DeleteNvrChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNvrChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNvrChannelResponse setBody(DeleteNvrChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNvrChannelResponseBody getBody() {
        return this.body;
    }

}
