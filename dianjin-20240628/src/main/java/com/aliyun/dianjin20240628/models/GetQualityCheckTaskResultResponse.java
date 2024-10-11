// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetQualityCheckTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityCheckTaskResultResponseBody body;

    public static GetQualityCheckTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckTaskResultResponse self = new GetQualityCheckTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityCheckTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityCheckTaskResultResponse setBody(GetQualityCheckTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityCheckTaskResultResponseBody getBody() {
        return this.body;
    }

}
