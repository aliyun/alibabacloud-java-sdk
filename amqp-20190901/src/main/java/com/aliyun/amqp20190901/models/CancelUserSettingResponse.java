// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CancelUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelUserSettingResponseBody body;

    public static CancelUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUserSettingResponse self = new CancelUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public CancelUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelUserSettingResponse setBody(CancelUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUserSettingResponseBody getBody() {
        return this.body;
    }

}
