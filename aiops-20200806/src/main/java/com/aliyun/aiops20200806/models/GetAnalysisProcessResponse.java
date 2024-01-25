// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAnalysisProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAnalysisProcessResponseBody body;

    public static GetAnalysisProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisProcessResponse self = new GetAnalysisProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetAnalysisProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnalysisProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnalysisProcessResponse setBody(GetAnalysisProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnalysisProcessResponseBody getBody() {
        return this.body;
    }

}
