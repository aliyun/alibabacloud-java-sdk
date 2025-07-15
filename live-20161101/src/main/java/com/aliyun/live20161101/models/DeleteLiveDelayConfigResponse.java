// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveDelayConfigResponseBody body;

    public static DeleteLiveDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDelayConfigResponse self = new DeleteLiveDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveDelayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveDelayConfigResponse setBody(DeleteLiveDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveDelayConfigResponseBody getBody() {
        return this.body;
    }

}
