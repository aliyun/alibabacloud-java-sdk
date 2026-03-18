// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class TriggerStackExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerStackExecutionResponseBody body;

    public static TriggerStackExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerStackExecutionResponse self = new TriggerStackExecutionResponse();
        return TeaModel.build(map, self);
    }

    public TriggerStackExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerStackExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerStackExecutionResponse setBody(TriggerStackExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerStackExecutionResponseBody getBody() {
        return this.body;
    }

}
