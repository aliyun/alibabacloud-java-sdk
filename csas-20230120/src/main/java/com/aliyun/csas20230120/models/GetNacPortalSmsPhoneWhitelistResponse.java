// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetNacPortalSmsPhoneWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNacPortalSmsPhoneWhitelistResponseBody body;

    public static GetNacPortalSmsPhoneWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNacPortalSmsPhoneWhitelistResponse self = new GetNacPortalSmsPhoneWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public GetNacPortalSmsPhoneWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNacPortalSmsPhoneWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNacPortalSmsPhoneWhitelistResponse setBody(GetNacPortalSmsPhoneWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNacPortalSmsPhoneWhitelistResponseBody getBody() {
        return this.body;
    }

}
