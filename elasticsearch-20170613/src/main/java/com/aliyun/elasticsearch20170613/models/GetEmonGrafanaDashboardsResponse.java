// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonGrafanaDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmonGrafanaDashboardsResponseBody body;

    public static GetEmonGrafanaDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmonGrafanaDashboardsResponse self = new GetEmonGrafanaDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public GetEmonGrafanaDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmonGrafanaDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmonGrafanaDashboardsResponse setBody(GetEmonGrafanaDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmonGrafanaDashboardsResponseBody getBody() {
        return this.body;
    }

}
