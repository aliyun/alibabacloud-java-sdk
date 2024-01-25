// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisListLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexDialysisListLineResponseBody body;

    public static GetIndexDialysisListLineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisListLineResponse self = new GetIndexDialysisListLineResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisListLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexDialysisListLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexDialysisListLineResponse setBody(GetIndexDialysisListLineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexDialysisListLineResponseBody getBody() {
        return this.body;
    }

}
