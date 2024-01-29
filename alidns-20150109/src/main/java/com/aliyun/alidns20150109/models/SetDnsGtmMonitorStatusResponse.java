// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmMonitorStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDnsGtmMonitorStatusResponseBody body;

    public static SetDnsGtmMonitorStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDnsGtmMonitorStatusResponse self = new SetDnsGtmMonitorStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDnsGtmMonitorStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDnsGtmMonitorStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDnsGtmMonitorStatusResponse setBody(SetDnsGtmMonitorStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDnsGtmMonitorStatusResponseBody getBody() {
        return this.body;
    }

}
