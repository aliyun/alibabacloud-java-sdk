// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlertSettingListResponseBody body;

    public static DeleteAlertSettingListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertSettingListResponse self = new DeleteAlertSettingListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertSettingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertSettingListResponse setBody(DeleteAlertSettingListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertSettingListResponseBody getBody() {
        return this.body;
    }

}
