// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDcdnWafPolicyDomainsResponseBody body;

    public static ModifyDcdnWafPolicyDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyDomainsResponse self = new ModifyDcdnWafPolicyDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDcdnWafPolicyDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDcdnWafPolicyDomainsResponse setBody(ModifyDcdnWafPolicyDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDcdnWafPolicyDomainsResponseBody getBody() {
        return this.body;
    }

}
