// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveResponseBody body;

    public static UpdateLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveResponse self = new UpdateLiveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveResponse setBody(UpdateLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveResponseBody getBody() {
        return this.body;
    }

}
