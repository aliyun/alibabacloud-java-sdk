// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetGuardLogStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGuardLogStatsResponseBody body;

    public static GetGuardLogStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGuardLogStatsResponse self = new GetGuardLogStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetGuardLogStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGuardLogStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGuardLogStatsResponse setBody(GetGuardLogStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGuardLogStatsResponseBody getBody() {
        return this.body;
    }

}
