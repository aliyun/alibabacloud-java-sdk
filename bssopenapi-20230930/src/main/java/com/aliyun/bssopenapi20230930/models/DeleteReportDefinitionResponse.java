// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteReportDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReportDefinitionResponseBody body;

    public static DeleteReportDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportDefinitionResponse self = new DeleteReportDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReportDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReportDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReportDefinitionResponse setBody(DeleteReportDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReportDefinitionResponseBody getBody() {
        return this.body;
    }

}
