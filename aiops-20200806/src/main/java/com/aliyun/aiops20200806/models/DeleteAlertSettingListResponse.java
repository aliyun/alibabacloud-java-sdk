// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteAlertSettingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertSettingListResponse setBody(DeleteAlertSettingListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertSettingListResponseBody getBody() {
        return this.body;
    }

}
