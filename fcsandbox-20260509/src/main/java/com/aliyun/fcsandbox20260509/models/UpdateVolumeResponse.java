// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVolumeResponseBody body;

    public static UpdateVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVolumeResponse self = new UpdateVolumeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVolumeResponse setBody(UpdateVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVolumeResponseBody getBody() {
        return this.body;
    }

}
