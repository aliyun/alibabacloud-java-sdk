// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateDocsSummaryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDocsSummaryTaskResponseBody body;

    public static CreateDocsSummaryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocsSummaryTaskResponse self = new CreateDocsSummaryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocsSummaryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocsSummaryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDocsSummaryTaskResponse setBody(CreateDocsSummaryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocsSummaryTaskResponseBody getBody() {
        return this.body;
    }

}
