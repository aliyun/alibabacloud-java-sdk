// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceResponseBody body;

    public static ModifyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponse self = new ModifyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceResponse setBody(ModifyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceResponseBody getBody() {
        return this.body;
    }

}
