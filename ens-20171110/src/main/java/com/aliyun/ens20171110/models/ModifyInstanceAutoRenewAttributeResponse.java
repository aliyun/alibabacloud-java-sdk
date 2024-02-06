// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceAutoRenewAttributeResponseBody body;

    public static ModifyInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewAttributeResponse self = new ModifyInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAutoRenewAttributeResponse setBody(ModifyInstanceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
