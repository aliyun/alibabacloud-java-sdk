// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ResizeContainerGroupVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResizeContainerGroupVolumeResponseBody body;

    public static ResizeContainerGroupVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeContainerGroupVolumeResponse self = new ResizeContainerGroupVolumeResponse();
        return TeaModel.build(map, self);
    }

    public ResizeContainerGroupVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeContainerGroupVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeContainerGroupVolumeResponse setBody(ResizeContainerGroupVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeContainerGroupVolumeResponseBody getBody() {
        return this.body;
    }

}
