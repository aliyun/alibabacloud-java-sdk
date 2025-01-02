// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogAnalysisResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDialogAnalysisResultResponseBody body;

    public static GetDialogAnalysisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDialogAnalysisResultResponse self = new GetDialogAnalysisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDialogAnalysisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDialogAnalysisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDialogAnalysisResultResponse setBody(GetDialogAnalysisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDialogAnalysisResultResponseBody getBody() {
        return this.body;
    }

}
