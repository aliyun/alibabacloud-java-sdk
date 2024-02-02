// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartEditContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartEditContactFlowResponseBody body;

    public static StartEditContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEditContactFlowResponse self = new StartEditContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public StartEditContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEditContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartEditContactFlowResponse setBody(StartEditContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEditContactFlowResponseBody getBody() {
        return this.body;
    }

}
