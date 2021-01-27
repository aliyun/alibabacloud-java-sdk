// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateListenerResponseBody body;

    public static UpdateListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerResponse self = new UpdateListenerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateListenerResponse setBody(UpdateListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateListenerResponseBody getBody() {
        return this.body;
    }

}
