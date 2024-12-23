// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateTunnelQuotaTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTunnelQuotaTimerResponseBody body;

    public static UpdateTunnelQuotaTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelQuotaTimerResponse self = new UpdateTunnelQuotaTimerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelQuotaTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTunnelQuotaTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTunnelQuotaTimerResponse setBody(UpdateTunnelQuotaTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTunnelQuotaTimerResponseBody getBody() {
        return this.body;
    }

}
