// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StartLifecyclePolicyExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartLifecyclePolicyExecutionResponseBody body;

    public static StartLifecyclePolicyExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLifecyclePolicyExecutionResponse self = new StartLifecyclePolicyExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartLifecyclePolicyExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLifecyclePolicyExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartLifecyclePolicyExecutionResponse setBody(StartLifecyclePolicyExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLifecyclePolicyExecutionResponseBody getBody() {
        return this.body;
    }

}
