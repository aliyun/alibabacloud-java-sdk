// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDrdsInstanceDescriptionResponseBody body;

    public static ModifyDrdsInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsInstanceDescriptionResponse self = new ModifyDrdsInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDrdsInstanceDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDrdsInstanceDescriptionResponse setBody(ModifyDrdsInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDrdsInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
