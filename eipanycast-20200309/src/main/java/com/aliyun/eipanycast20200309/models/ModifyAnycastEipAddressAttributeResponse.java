// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAnycastEipAddressAttributeResponseBody body;

    public static ModifyAnycastEipAddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressAttributeResponse self = new ModifyAnycastEipAddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAnycastEipAddressAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAnycastEipAddressAttributeResponse setBody(ModifyAnycastEipAddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAnycastEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

}
