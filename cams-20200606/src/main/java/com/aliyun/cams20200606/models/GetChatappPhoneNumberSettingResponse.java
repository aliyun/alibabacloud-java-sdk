// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappPhoneNumberSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatappPhoneNumberSettingResponseBody body;

    public static GetChatappPhoneNumberSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappPhoneNumberSettingResponse self = new GetChatappPhoneNumberSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappPhoneNumberSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappPhoneNumberSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappPhoneNumberSettingResponse setBody(GetChatappPhoneNumberSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappPhoneNumberSettingResponseBody getBody() {
        return this.body;
    }

}
