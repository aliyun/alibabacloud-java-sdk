// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateAnnualDocSummaryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnnualDocSummaryTaskResponseBody body;

    public static CreateAnnualDocSummaryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnualDocSummaryTaskResponse self = new CreateAnnualDocSummaryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnnualDocSummaryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnnualDocSummaryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnnualDocSummaryTaskResponse setBody(CreateAnnualDocSummaryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnnualDocSummaryTaskResponseBody getBody() {
        return this.body;
    }

}
