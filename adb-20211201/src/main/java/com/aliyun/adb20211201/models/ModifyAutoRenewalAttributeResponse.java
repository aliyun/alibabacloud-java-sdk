// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewalAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoRenewalAttributeResponseBody body;

    public static ModifyAutoRenewalAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewalAttributeResponse self = new ModifyAutoRenewalAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewalAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoRenewalAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoRenewalAttributeResponse setBody(ModifyAutoRenewalAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoRenewalAttributeResponseBody getBody() {
        return this.body;
    }

}
