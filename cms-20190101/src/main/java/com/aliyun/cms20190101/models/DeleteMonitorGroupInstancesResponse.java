// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMonitorGroupInstancesResponseBody body;

    public static DeleteMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupInstancesResponse self = new DeleteMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorGroupInstancesResponse setBody(DeleteMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
