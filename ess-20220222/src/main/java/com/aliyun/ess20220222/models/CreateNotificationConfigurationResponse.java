// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateNotificationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNotificationConfigurationResponseBody body;

    public static CreateNotificationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNotificationConfigurationResponse self = new CreateNotificationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateNotificationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNotificationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNotificationConfigurationResponse setBody(CreateNotificationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNotificationConfigurationResponseBody getBody() {
        return this.body;
    }

}
