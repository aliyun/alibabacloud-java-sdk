// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServerResponseBody body;

    public static UpdateServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerResponse self = new UpdateServerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerResponse setBody(UpdateServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerResponseBody getBody() {
        return this.body;
    }

}
