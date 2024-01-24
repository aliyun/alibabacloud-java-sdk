// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StartDataFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartDataFlowResponseBody body;

    public static StartDataFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDataFlowResponse self = new StartDataFlowResponse();
        return TeaModel.build(map, self);
    }

    public StartDataFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDataFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDataFlowResponse setBody(StartDataFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDataFlowResponseBody getBody() {
        return this.body;
    }

}
