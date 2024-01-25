// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutAlertSettingListResponseBody body;

    public static PutAlertSettingListResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingListResponse self = new PutAlertSettingListResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertSettingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAlertSettingListResponse setBody(PutAlertSettingListResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertSettingListResponseBody getBody() {
        return this.body;
    }

}
