// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StopLifecyclePolicyExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLifecyclePolicyExecutionResponseBody body;

    public static StopLifecyclePolicyExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLifecyclePolicyExecutionResponse self = new StopLifecyclePolicyExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StopLifecyclePolicyExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLifecyclePolicyExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLifecyclePolicyExecutionResponse setBody(StopLifecyclePolicyExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLifecyclePolicyExecutionResponseBody getBody() {
        return this.body;
    }

}
