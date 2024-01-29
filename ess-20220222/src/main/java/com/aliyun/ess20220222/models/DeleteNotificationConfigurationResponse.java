// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteNotificationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNotificationConfigurationResponseBody body;

    public static DeleteNotificationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationConfigurationResponse self = new DeleteNotificationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNotificationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNotificationConfigurationResponse setBody(DeleteNotificationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNotificationConfigurationResponseBody getBody() {
        return this.body;
    }

}
