// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserSettingResponseBody body;

    public static GetUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserSettingResponse self = new GetUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserSettingResponse setBody(GetUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserSettingResponseBody getBody() {
        return this.body;
    }

}
