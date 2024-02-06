// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoRenewAttributeResponseBody body;

    public static ModifyAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeResponse self = new ModifyAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoRenewAttributeResponse setBody(ModifyAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
