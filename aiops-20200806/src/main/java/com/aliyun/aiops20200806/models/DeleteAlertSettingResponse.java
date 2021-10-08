// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteAlertSettingResponse setBody(DeleteAlertSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertSettingResponseBody getBody() {
        return this.body;
    }

}
