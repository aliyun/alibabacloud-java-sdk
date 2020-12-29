// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDnsGtmMonitorResponseBody body;

    public static UpdateDnsGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmMonitorResponse self = new UpdateDnsGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsGtmMonitorResponse setBody(UpdateDnsGtmMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsGtmMonitorResponseBody getBody() {
        return this.body;
    }

}
