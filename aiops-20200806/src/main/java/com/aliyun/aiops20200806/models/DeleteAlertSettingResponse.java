// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertSettingResponseBody body;

    public static DeleteAlertSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertSettingResponse self = new DeleteAlertSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertSettingResponse setBody(DeleteAlertSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertSettingResponseBody getBody() {
        return this.body;
    }

}
