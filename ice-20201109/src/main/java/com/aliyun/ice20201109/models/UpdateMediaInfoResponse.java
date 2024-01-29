// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaInfoResponseBody body;

    public static UpdateMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoResponse self = new UpdateMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaInfoResponse setBody(UpdateMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaInfoResponseBody getBody() {
        return this.body;
    }

}
