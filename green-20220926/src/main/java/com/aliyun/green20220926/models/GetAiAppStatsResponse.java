// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppStatsResponseBody body;

    public static GetAiAppStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppStatsResponse self = new GetAiAppStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppStatsResponse setBody(GetAiAppStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppStatsResponseBody getBody() {
        return this.body;
    }

}
