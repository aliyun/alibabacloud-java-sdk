// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateWorkFlowByJsonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkFlowByJsonResponseBody body;

    public static CreateWorkFlowByJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkFlowByJsonResponse self = new CreateWorkFlowByJsonResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkFlowByJsonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkFlowByJsonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkFlowByJsonResponse setBody(CreateWorkFlowByJsonResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkFlowByJsonResponseBody getBody() {
        return this.body;
    }

}
