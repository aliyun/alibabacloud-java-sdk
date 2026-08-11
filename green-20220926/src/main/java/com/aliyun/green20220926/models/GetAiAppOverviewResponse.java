// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppOverviewResponseBody body;

    public static GetAiAppOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppOverviewResponse self = new GetAiAppOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppOverviewResponse setBody(GetAiAppOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppOverviewResponseBody getBody() {
        return this.body;
    }

}
