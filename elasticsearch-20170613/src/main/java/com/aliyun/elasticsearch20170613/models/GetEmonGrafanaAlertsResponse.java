// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonGrafanaAlertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmonGrafanaAlertsResponseBody body;

    public static GetEmonGrafanaAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmonGrafanaAlertsResponse self = new GetEmonGrafanaAlertsResponse();
        return TeaModel.build(map, self);
    }

    public GetEmonGrafanaAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmonGrafanaAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmonGrafanaAlertsResponse setBody(GetEmonGrafanaAlertsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmonGrafanaAlertsResponseBody getBody() {
        return this.body;
    }

}
