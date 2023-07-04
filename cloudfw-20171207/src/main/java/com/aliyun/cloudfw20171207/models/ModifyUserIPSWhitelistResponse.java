// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserIPSWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUserIPSWhitelistResponseBody body;

    public static ModifyUserIPSWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserIPSWhitelistResponse self = new ModifyUserIPSWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserIPSWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserIPSWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserIPSWhitelistResponse setBody(ModifyUserIPSWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserIPSWhitelistResponseBody getBody() {
        return this.body;
    }

}
