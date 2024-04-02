// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuditSettingResponseBody body;

    public static UpdateAuditSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditSettingResponse self = new UpdateAuditSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuditSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuditSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuditSettingResponse setBody(UpdateAuditSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuditSettingResponseBody getBody() {
        return this.body;
    }

}
