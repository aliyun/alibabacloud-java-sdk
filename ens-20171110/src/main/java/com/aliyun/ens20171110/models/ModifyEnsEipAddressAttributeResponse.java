// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsEipAddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEnsEipAddressAttributeResponseBody body;

    public static ModifyEnsEipAddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnsEipAddressAttributeResponse self = new ModifyEnsEipAddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEnsEipAddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEnsEipAddressAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEnsEipAddressAttributeResponse setBody(ModifyEnsEipAddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEnsEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

}
