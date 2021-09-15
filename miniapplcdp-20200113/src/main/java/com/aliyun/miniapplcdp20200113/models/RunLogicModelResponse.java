// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class RunLogicModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunLogicModelResponseBody body;

    public static RunLogicModelResponse build(java.util.Map<String, ?> map) throws Exception {
        RunLogicModelResponse self = new RunLogicModelResponse();
        return TeaModel.build(map, self);
    }

    public RunLogicModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunLogicModelResponse setBody(RunLogicModelResponseBody body) {
        this.body = body;
        return this;
    }
    public RunLogicModelResponseBody getBody() {
        return this.body;
    }

}
