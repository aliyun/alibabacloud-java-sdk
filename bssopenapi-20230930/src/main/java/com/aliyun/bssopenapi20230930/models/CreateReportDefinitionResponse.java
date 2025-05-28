// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateReportDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReportDefinitionResponseBody body;

    public static CreateReportDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReportDefinitionResponse self = new CreateReportDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public CreateReportDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReportDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReportDefinitionResponse setBody(CreateReportDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReportDefinitionResponseBody getBody() {
        return this.body;
    }

}
