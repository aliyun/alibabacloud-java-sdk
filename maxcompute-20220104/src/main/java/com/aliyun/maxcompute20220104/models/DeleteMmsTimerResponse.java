// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteMmsTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMmsTimerResponseBody body;

    public static DeleteMmsTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmsTimerResponse self = new DeleteMmsTimerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMmsTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMmsTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMmsTimerResponse setBody(DeleteMmsTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMmsTimerResponseBody getBody() {
        return this.body;
    }

}
