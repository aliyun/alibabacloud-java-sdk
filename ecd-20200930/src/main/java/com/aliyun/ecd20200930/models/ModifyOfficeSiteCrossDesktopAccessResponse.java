// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteCrossDesktopAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfficeSiteCrossDesktopAccessResponseBody body;

    public static ModifyOfficeSiteCrossDesktopAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteCrossDesktopAccessResponse self = new ModifyOfficeSiteCrossDesktopAccessResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse setBody(ModifyOfficeSiteCrossDesktopAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfficeSiteCrossDesktopAccessResponseBody getBody() {
        return this.body;
    }

}
