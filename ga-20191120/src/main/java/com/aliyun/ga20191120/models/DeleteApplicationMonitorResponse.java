// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApplicationMonitorResponseBody body;

    public static DeleteApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationMonitorResponse self = new DeleteApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationMonitorResponse setBody(DeleteApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
