// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectStatsResponseBody body;

    public static GetProjectStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectStatsResponse self = new GetProjectStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectStatsResponse setBody(GetProjectStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectStatsResponseBody getBody() {
        return this.body;
    }

}
