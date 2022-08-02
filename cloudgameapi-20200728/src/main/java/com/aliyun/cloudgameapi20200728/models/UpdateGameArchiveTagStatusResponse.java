// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UpdateGameArchiveTagStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGameArchiveTagStatusResponseBody body;

    public static UpdateGameArchiveTagStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGameArchiveTagStatusResponse self = new UpdateGameArchiveTagStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGameArchiveTagStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGameArchiveTagStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGameArchiveTagStatusResponse setBody(UpdateGameArchiveTagStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGameArchiveTagStatusResponseBody getBody() {
        return this.body;
    }

}
