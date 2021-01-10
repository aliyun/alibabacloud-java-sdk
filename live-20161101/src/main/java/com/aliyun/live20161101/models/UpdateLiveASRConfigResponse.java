// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveASRConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveASRConfigResponseBody body;

    public static UpdateLiveASRConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveASRConfigResponse self = new UpdateLiveASRConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveASRConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveASRConfigResponse setBody(UpdateLiveASRConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveASRConfigResponseBody getBody() {
        return this.body;
    }

}
