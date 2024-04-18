// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceNameResponseBody body;

    public static ModifyInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNameResponse self = new ModifyInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceNameResponse setBody(ModifyInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNameResponseBody getBody() {
        return this.body;
    }

}
