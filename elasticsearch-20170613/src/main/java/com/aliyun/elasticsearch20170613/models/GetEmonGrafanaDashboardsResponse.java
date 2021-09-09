// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonGrafanaDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetEmonGrafanaDashboardsResponse setBody(GetEmonGrafanaDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmonGrafanaDashboardsResponseBody getBody() {
        return this.body;
    }

}
