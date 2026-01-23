// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteTriggerNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTriggerNodeResponseBody body;

    public static ExecuteTriggerNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTriggerNodeResponse self = new ExecuteTriggerNodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTriggerNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTriggerNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTriggerNodeResponse setBody(ExecuteTriggerNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTriggerNodeResponseBody getBody() {
        return this.body;
    }

}
