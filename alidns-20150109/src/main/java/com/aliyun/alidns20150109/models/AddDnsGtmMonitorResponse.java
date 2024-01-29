// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDnsGtmMonitorResponseBody body;

    public static AddDnsGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmMonitorResponse self = new AddDnsGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnsGtmMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDnsGtmMonitorResponse setBody(AddDnsGtmMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsGtmMonitorResponseBody getBody() {
        return this.body;
    }

}
