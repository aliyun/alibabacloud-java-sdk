// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111.models;

import com.aliyun.tea.*;

public class ModifyTerminalSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTerminalSettingsResponseBody body;

    public static ModifyTerminalSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTerminalSettingsResponse self = new ModifyTerminalSettingsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTerminalSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTerminalSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTerminalSettingsResponse setBody(ModifyTerminalSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTerminalSettingsResponseBody getBody() {
        return this.body;
    }

}
