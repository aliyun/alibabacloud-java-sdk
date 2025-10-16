// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesToDefaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpsRulesToDefaultResponseBody body;

    public static ModifyIpsRulesToDefaultResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpsRulesToDefaultResponse self = new ModifyIpsRulesToDefaultResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpsRulesToDefaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpsRulesToDefaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpsRulesToDefaultResponse setBody(ModifyIpsRulesToDefaultResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpsRulesToDefaultResponseBody getBody() {
        return this.body;
    }

}
