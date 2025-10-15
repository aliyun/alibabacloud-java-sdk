// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunDialogAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDialogAnalysisResponseBody body;

    public static RunDialogAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDialogAnalysisResponse self = new RunDialogAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunDialogAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDialogAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDialogAnalysisResponse setBody(RunDialogAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDialogAnalysisResponseBody getBody() {
        return this.body;
    }

}
