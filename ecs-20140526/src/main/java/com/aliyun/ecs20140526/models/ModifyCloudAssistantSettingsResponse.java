// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudAssistantSettingsResponseBody body;

    public static ModifyCloudAssistantSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudAssistantSettingsResponse self = new ModifyCloudAssistantSettingsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudAssistantSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudAssistantSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudAssistantSettingsResponse setBody(ModifyCloudAssistantSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudAssistantSettingsResponseBody getBody() {
        return this.body;
    }

}
