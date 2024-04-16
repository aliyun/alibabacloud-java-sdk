// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class RunLogicModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RunLogicModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunLogicModelResponse setBody(RunLogicModelResponseBody body) {
        this.body = body;
        return this;
    }
    public RunLogicModelResponseBody getBody() {
        return this.body;
    }

}
