// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetLiveStreamsNotifyUrlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveStreamsNotifyUrlConfigResponse setBody(SetLiveStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
