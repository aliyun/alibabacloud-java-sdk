// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitoringConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutMonitoringConfigResponseBody body;

    public static PutMonitoringConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMonitoringConfigResponse self = new PutMonitoringConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutMonitoringConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMonitoringConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutMonitoringConfigResponse setBody(PutMonitoringConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMonitoringConfigResponseBody getBody() {
        return this.body;
    }

}
