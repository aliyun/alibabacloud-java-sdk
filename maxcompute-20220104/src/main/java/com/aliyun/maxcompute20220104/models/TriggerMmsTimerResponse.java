// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class TriggerMmsTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerMmsTimerResponseBody body;

    public static TriggerMmsTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerMmsTimerResponse self = new TriggerMmsTimerResponse();
        return TeaModel.build(map, self);
    }

    public TriggerMmsTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerMmsTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerMmsTimerResponse setBody(TriggerMmsTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerMmsTimerResponseBody getBody() {
        return this.body;
    }

}
