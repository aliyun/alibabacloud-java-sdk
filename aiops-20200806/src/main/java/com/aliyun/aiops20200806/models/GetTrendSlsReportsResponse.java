// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTrendSlsReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrendSlsReportsResponseBody body;

    public static GetTrendSlsReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrendSlsReportsResponse self = new GetTrendSlsReportsResponse();
        return TeaModel.build(map, self);
    }

    public GetTrendSlsReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrendSlsReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrendSlsReportsResponse setBody(GetTrendSlsReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrendSlsReportsResponseBody getBody() {
        return this.body;
    }

}
