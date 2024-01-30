// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyResourceGroupResponseBody body;

    public static ModifyResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceGroupResponse self = new ModifyResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourceGroupResponse setBody(ModifyResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceGroupResponseBody getBody() {
        return this.body;
    }

}
