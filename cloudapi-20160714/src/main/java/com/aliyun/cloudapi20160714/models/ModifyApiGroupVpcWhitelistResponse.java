// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupVpcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApiGroupVpcWhitelistResponseBody body;

    public static ModifyApiGroupVpcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupVpcWhitelistResponse self = new ModifyApiGroupVpcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupVpcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiGroupVpcWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiGroupVpcWhitelistResponse setBody(ModifyApiGroupVpcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiGroupVpcWhitelistResponseBody getBody() {
        return this.body;
    }

}
