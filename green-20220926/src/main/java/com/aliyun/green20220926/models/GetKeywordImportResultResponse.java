// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordImportResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeywordImportResultResponseBody body;

    public static GetKeywordImportResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordImportResultResponse self = new GetKeywordImportResultResponse();
        return TeaModel.build(map, self);
    }

    public GetKeywordImportResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeywordImportResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeywordImportResultResponse setBody(GetKeywordImportResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeywordImportResultResponseBody getBody() {
        return this.body;
    }

}
