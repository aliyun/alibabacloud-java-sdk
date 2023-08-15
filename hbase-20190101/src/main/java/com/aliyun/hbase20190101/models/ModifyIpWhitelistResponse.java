// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpWhitelistResponseBody body;

    public static ModifyIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhitelistResponse self = new ModifyIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpWhitelistResponse setBody(ModifyIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
