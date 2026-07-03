// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StopDataAgentAccuracyTestTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDataAgentAccuracyTestTaskResponseBody body;

    public static StopDataAgentAccuracyTestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataAgentAccuracyTestTaskResponse self = new StopDataAgentAccuracyTestTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDataAgentAccuracyTestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataAgentAccuracyTestTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDataAgentAccuracyTestTaskResponse setBody(StopDataAgentAccuracyTestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataAgentAccuracyTestTaskResponseBody getBody() {
        return this.body;
    }

}
