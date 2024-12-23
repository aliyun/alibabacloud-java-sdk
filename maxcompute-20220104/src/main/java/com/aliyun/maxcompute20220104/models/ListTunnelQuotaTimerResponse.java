// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListTunnelQuotaTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTunnelQuotaTimerResponseBody body;

    public static ListTunnelQuotaTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTunnelQuotaTimerResponse self = new ListTunnelQuotaTimerResponse();
        return TeaModel.build(map, self);
    }

    public ListTunnelQuotaTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTunnelQuotaTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTunnelQuotaTimerResponse setBody(ListTunnelQuotaTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTunnelQuotaTimerResponseBody getBody() {
        return this.body;
    }

}
