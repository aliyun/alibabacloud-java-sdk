// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyGadInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGadInstanceNameResponseBody body;

    public static ModifyGadInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGadInstanceNameResponse self = new ModifyGadInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGadInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGadInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGadInstanceNameResponse setBody(ModifyGadInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGadInstanceNameResponseBody getBody() {
        return this.body;
    }

}
