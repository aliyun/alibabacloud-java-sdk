// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateDialogAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDialogAnalysisTaskResponseBody body;

    public static CreateDialogAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogAnalysisTaskResponse self = new CreateDialogAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDialogAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDialogAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDialogAnalysisTaskResponse setBody(CreateDialogAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDialogAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
