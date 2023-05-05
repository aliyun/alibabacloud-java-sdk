// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateSilenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSilenceResponseBody body;

    public static UpdateSilenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSilenceResponse self = new UpdateSilenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSilenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSilenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSilenceResponse setBody(UpdateSilenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSilenceResponseBody getBody() {
        return this.body;
    }

}
