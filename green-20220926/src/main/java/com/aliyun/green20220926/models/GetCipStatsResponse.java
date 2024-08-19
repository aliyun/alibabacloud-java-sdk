// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetCipStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCipStatsResponseBody body;

    public static GetCipStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCipStatsResponse self = new GetCipStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetCipStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCipStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCipStatsResponse setBody(GetCipStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCipStatsResponseBody getBody() {
        return this.body;
    }

}
