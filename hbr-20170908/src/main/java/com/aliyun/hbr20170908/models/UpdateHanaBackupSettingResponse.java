// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaBackupSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHanaBackupSettingResponseBody body;

    public static UpdateHanaBackupSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaBackupSettingResponse self = new UpdateHanaBackupSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHanaBackupSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHanaBackupSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHanaBackupSettingResponse setBody(UpdateHanaBackupSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHanaBackupSettingResponseBody getBody() {
        return this.body;
    }

}
