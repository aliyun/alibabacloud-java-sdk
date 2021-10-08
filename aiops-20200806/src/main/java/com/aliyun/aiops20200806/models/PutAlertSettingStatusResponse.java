// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutAlertSettingStatusResponseBody body;

    public static PutAlertSettingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingStatusResponse self = new PutAlertSettingStatusResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertSettingStatusResponse setBody(PutAlertSettingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertSettingStatusResponseBody getBody() {
        return this.body;
    }

}
