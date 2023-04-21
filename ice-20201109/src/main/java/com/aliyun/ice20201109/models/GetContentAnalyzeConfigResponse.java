// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetContentAnalyzeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetContentAnalyzeConfigResponseBody body;

    public static GetContentAnalyzeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContentAnalyzeConfigResponse self = new GetContentAnalyzeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetContentAnalyzeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContentAnalyzeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContentAnalyzeConfigResponse setBody(GetContentAnalyzeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContentAnalyzeConfigResponseBody getBody() {
        return this.body;
    }

}
