// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceNetworkAttributeResponseBody body;

    public static ModifyInstanceNetworkAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkAttributeResponse self = new ModifyInstanceNetworkAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNetworkAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceNetworkAttributeResponse setBody(ModifyInstanceNetworkAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNetworkAttributeResponseBody getBody() {
        return this.body;
    }

}
