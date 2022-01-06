// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationMonitorResponseBody body;

    public static ListApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorResponse self = new ListApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationMonitorResponse setBody(ListApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
