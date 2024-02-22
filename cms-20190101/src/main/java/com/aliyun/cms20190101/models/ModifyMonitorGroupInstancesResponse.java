// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyMonitorGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMonitorGroupInstancesResponse setBody(ModifyMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
