// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunTriggerNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunTriggerNodeResponseBody body;

    public static RunTriggerNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RunTriggerNodeResponse self = new RunTriggerNodeResponse();
        return TeaModel.build(map, self);
    }

    public RunTriggerNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunTriggerNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunTriggerNodeResponse setBody(RunTriggerNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RunTriggerNodeResponseBody getBody() {
        return this.body;
    }

}
