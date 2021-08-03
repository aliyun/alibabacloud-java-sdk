// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteCrossDesktopAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyOfficeSiteCrossDesktopAccessResponse setBody(ModifyOfficeSiteCrossDesktopAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfficeSiteCrossDesktopAccessResponseBody getBody() {
        return this.body;
    }

}
