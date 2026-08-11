// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateNacPortalSmsPhoneWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacPortalSmsPhoneWhitelistResponseBody body;

    public static UpdateNacPortalSmsPhoneWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacPortalSmsPhoneWhitelistResponse self = new UpdateNacPortalSmsPhoneWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacPortalSmsPhoneWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacPortalSmsPhoneWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacPortalSmsPhoneWhitelistResponse setBody(UpdateNacPortalSmsPhoneWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacPortalSmsPhoneWhitelistResponseBody getBody() {
        return this.body;
    }

}
