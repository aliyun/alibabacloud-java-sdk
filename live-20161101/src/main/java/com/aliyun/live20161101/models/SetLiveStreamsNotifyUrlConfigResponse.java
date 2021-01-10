// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLiveStreamsNotifyUrlConfigResponseBody body;

    public static SetLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamsNotifyUrlConfigResponse self = new SetLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveStreamsNotifyUrlConfigResponse setBody(SetLiveStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
