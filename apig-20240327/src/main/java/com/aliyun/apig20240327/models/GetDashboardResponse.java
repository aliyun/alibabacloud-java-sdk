// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDashboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDashboardResponseBody body;

    public static GetDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardResponse self = new GetDashboardResponse();
        return TeaModel.build(map, self);
    }

    public GetDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDashboardResponse setBody(GetDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDashboardResponseBody getBody() {
        return this.body;
    }

}
