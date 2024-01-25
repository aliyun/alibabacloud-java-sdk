// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutAlertSettingResponseBody body;

    public static PutAlertSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingResponse self = new PutAlertSettingResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAlertSettingResponse setBody(PutAlertSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertSettingResponseBody getBody() {
        return this.body;
    }

}
