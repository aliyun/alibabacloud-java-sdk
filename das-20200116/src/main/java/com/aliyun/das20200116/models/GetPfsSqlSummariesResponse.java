// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSummariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPfsSqlSummariesResponseBody body;

    public static GetPfsSqlSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSummariesResponse self = new GetPfsSqlSummariesResponse();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPfsSqlSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPfsSqlSummariesResponse setBody(GetPfsSqlSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPfsSqlSummariesResponseBody getBody() {
        return this.body;
    }

}
