// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetStorageAnalysisResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStorageAnalysisResultResponseBody body;

    public static GetStorageAnalysisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAnalysisResultResponse self = new GetStorageAnalysisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageAnalysisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageAnalysisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageAnalysisResultResponse setBody(GetStorageAnalysisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageAnalysisResultResponseBody getBody() {
        return this.body;
    }

}
