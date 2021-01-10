// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveASRConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveASRConfigResponseBody body;

    public static DeleteLiveASRConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveASRConfigResponse self = new DeleteLiveASRConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveASRConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveASRConfigResponse setBody(DeleteLiveASRConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveASRConfigResponseBody getBody() {
        return this.body;
    }

}
