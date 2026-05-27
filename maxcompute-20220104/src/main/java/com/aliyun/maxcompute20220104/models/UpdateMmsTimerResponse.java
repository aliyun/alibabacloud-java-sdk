// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmsTimerResponseBody body;

    public static UpdateMmsTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTimerResponse self = new UpdateMmsTimerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmsTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmsTimerResponse setBody(UpdateMmsTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmsTimerResponseBody getBody() {
        return this.body;
    }

}
