// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateNotificationSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNotificationSettingResponseBody body;

    public static UpdateNotificationSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotificationSettingResponse self = new UpdateNotificationSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNotificationSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNotificationSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNotificationSettingResponse setBody(UpdateNotificationSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNotificationSettingResponseBody getBody() {
        return this.body;
    }

}
