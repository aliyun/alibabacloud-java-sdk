// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteLogMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogMonitorResponseBody body;

    public static DeleteLogMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogMonitorResponse self = new DeleteLogMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogMonitorResponse setBody(DeleteLogMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogMonitorResponseBody getBody() {
        return this.body;
    }

}
