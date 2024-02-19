// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetIMVMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetIMVMonitorDataResponseBody body;

    public static ResetIMVMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetIMVMonitorDataResponse self = new ResetIMVMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public ResetIMVMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetIMVMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetIMVMonitorDataResponse setBody(ResetIMVMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetIMVMonitorDataResponseBody getBody() {
        return this.body;
    }

}
