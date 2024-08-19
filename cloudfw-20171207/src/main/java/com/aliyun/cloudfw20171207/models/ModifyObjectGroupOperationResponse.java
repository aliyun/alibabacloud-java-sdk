// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyObjectGroupOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyObjectGroupOperationResponseBody body;

    public static ModifyObjectGroupOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyObjectGroupOperationResponse self = new ModifyObjectGroupOperationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyObjectGroupOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyObjectGroupOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyObjectGroupOperationResponse setBody(ModifyObjectGroupOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyObjectGroupOperationResponseBody getBody() {
        return this.body;
    }

}
