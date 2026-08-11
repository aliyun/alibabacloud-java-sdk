// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetQpsStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQpsStatsResponseBody body;

    public static GetQpsStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQpsStatsResponse self = new GetQpsStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetQpsStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQpsStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQpsStatsResponse setBody(GetQpsStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQpsStatsResponseBody getBody() {
        return this.body;
    }

}
