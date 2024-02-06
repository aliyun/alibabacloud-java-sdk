// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPrepayInstanceSpecResponseBody body;

    public static ModifyPrepayInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecResponse self = new ModifyPrepayInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrepayInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrepayInstanceSpecResponse setBody(ModifyPrepayInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrepayInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
