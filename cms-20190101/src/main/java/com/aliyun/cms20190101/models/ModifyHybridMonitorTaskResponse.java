// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridMonitorTaskResponseBody body;

    public static ModifyHybridMonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorTaskResponse self = new ModifyHybridMonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridMonitorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridMonitorTaskResponse setBody(ModifyHybridMonitorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridMonitorTaskResponseBody getBody() {
        return this.body;
    }

}
