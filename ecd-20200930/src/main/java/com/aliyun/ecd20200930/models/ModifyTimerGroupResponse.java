// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyTimerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTimerGroupResponseBody body;

    public static ModifyTimerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTimerGroupResponse self = new ModifyTimerGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTimerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTimerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTimerGroupResponse setBody(ModifyTimerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTimerGroupResponseBody getBody() {
        return this.body;
    }

}
