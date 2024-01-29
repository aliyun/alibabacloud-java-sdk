// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGtmMonitorResponseBody body;

    public static AddGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorResponse self = new AddGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AddGtmMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGtmMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGtmMonitorResponse setBody(AddGtmMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmMonitorResponseBody getBody() {
        return this.body;
    }

}
