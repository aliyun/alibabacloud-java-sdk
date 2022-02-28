// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateImageInfoResponseBody body;

    public static UpdateImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfoResponse self = new UpdateImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageInfoResponse setBody(UpdateImageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageInfoResponseBody getBody() {
        return this.body;
    }

}
