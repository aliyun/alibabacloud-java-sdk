// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetLiveStreamDelayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveStreamDelayConfigResponse setBody(SetLiveStreamDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamDelayConfigResponseBody getBody() {
        return this.body;
    }

}
