// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePullToPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivePullToPushResponseBody body;

    public static UpdateLivePullToPushResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePullToPushResponse self = new UpdateLivePullToPushResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePullToPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePullToPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePullToPushResponse setBody(UpdateLivePullToPushResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePullToPushResponseBody getBody() {
        return this.body;
    }

}
