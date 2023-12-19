// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaRetentionSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHanaRetentionSettingResponseBody body;

    public static UpdateHanaRetentionSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaRetentionSettingResponse self = new UpdateHanaRetentionSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHanaRetentionSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHanaRetentionSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHanaRetentionSettingResponse setBody(UpdateHanaRetentionSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHanaRetentionSettingResponseBody getBody() {
        return this.body;
    }

}
