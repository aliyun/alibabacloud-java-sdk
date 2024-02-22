// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMonitorGroupResponseBody body;

    public static ModifyMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupResponse self = new ModifyMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMonitorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMonitorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMonitorGroupResponse setBody(ModifyMonitorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMonitorGroupResponseBody getBody() {
        return this.body;
    }

}
