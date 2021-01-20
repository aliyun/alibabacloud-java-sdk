// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMonitorGroupInstancesResponseBody body;

    public static ModifyMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupInstancesResponse self = new ModifyMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMonitorGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMonitorGroupInstancesResponse setBody(ModifyMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
