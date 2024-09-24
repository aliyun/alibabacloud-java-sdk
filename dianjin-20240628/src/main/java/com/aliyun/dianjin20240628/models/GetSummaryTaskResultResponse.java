// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetSummaryTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSummaryTaskResultResponseBody body;

    public static GetSummaryTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryTaskResultResponse self = new GetSummaryTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSummaryTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSummaryTaskResultResponse setBody(GetSummaryTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSummaryTaskResultResponseBody getBody() {
        return this.body;
    }

}
