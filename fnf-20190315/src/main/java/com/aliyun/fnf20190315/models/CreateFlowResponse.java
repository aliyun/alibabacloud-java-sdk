// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowResponseBody body;

    public static CreateFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowResponse self = new CreateFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowResponse setBody(CreateFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowResponseBody getBody() {
        return this.body;
    }

}
