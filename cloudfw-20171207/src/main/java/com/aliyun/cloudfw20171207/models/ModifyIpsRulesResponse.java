// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpsRulesResponseBody body;

    public static ModifyIpsRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpsRulesResponse self = new ModifyIpsRulesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpsRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpsRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpsRulesResponse setBody(ModifyIpsRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpsRulesResponseBody getBody() {
        return this.body;
    }

}
