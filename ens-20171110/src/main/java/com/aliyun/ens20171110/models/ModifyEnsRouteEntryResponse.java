// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEnsRouteEntryResponseBody body;

    public static ModifyEnsRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnsRouteEntryResponse self = new ModifyEnsRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEnsRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEnsRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEnsRouteEntryResponse setBody(ModifyEnsRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEnsRouteEntryResponseBody getBody() {
        return this.body;
    }

}
