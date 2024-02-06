// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyNetworkAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNetworkAttributeResponseBody body;

    public static ModifyNetworkAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAttributeResponse self = new ModifyNetworkAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkAttributeResponse setBody(ModifyNetworkAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkAttributeResponseBody getBody() {
        return this.body;
    }

}
