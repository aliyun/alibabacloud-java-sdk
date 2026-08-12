// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DeleteVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVolumeResponseBody body;

    public static DeleteVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVolumeResponse self = new DeleteVolumeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVolumeResponse setBody(DeleteVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVolumeResponseBody getBody() {
        return this.body;
    }

}
