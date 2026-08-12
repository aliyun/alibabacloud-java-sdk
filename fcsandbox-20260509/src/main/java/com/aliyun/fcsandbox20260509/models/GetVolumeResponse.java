// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class GetVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVolumeResponseBody body;

    public static GetVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVolumeResponse self = new GetVolumeResponse();
        return TeaModel.build(map, self);
    }

    public GetVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVolumeResponse setBody(GetVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVolumeResponseBody getBody() {
        return this.body;
    }

}
