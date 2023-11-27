// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetUserMuteSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserMuteSettingResponseBody body;

    public static GetUserMuteSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMuteSettingResponse self = new GetUserMuteSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetUserMuteSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserMuteSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserMuteSettingResponse setBody(GetUserMuteSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserMuteSettingResponseBody getBody() {
        return this.body;
    }

}
