// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveDelayConfigResponseBody body;

    public static UpdateLiveDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveDelayConfigResponse self = new UpdateLiveDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveDelayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveDelayConfigResponse setBody(UpdateLiveDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveDelayConfigResponseBody getBody() {
        return this.body;
    }

}
