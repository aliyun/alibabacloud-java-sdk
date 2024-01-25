// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateLiveTeleprompterStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveTeleprompterStateResponseBody body;

    public static UpdateLiveTeleprompterStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTeleprompterStateResponse self = new UpdateLiveTeleprompterStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTeleprompterStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveTeleprompterStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveTeleprompterStateResponse setBody(UpdateLiveTeleprompterStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveTeleprompterStateResponseBody getBody() {
        return this.body;
    }

}
