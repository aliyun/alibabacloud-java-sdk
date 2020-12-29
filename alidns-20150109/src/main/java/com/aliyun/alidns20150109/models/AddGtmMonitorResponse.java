// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddGtmMonitorResponse setBody(AddGtmMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmMonitorResponseBody getBody() {
        return this.body;
    }

}
