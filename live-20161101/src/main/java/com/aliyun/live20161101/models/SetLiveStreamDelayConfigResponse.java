// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLiveStreamDelayConfigResponseBody body;

    public static SetLiveStreamDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamDelayConfigResponse self = new SetLiveStreamDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveStreamDelayConfigResponse setBody(SetLiveStreamDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamDelayConfigResponseBody getBody() {
        return this.body;
    }

}
