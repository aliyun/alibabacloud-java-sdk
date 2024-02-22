// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorSLSGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridMonitorSLSGroupResponseBody body;

    public static ModifyHybridMonitorSLSGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorSLSGroupResponse self = new ModifyHybridMonitorSLSGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorSLSGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridMonitorSLSGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridMonitorSLSGroupResponse setBody(ModifyHybridMonitorSLSGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridMonitorSLSGroupResponseBody getBody() {
        return this.body;
    }

}
