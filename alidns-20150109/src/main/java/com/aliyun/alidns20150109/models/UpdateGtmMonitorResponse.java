// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGtmMonitorResponseBody body;

    public static UpdateGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmMonitorResponse self = new UpdateGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGtmMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGtmMonitorResponse setBody(UpdateGtmMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGtmMonitorResponseBody getBody() {
        return this.body;
    }

}
