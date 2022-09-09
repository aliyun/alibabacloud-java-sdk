// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyNotificationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNotificationConfigurationResponseBody body;

    public static ModifyNotificationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNotificationConfigurationResponse self = new ModifyNotificationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNotificationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNotificationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNotificationConfigurationResponse setBody(ModifyNotificationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNotificationConfigurationResponseBody getBody() {
        return this.body;
    }

}
