// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ModifyContacterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyContacterResponseBody body;

    public static ModifyContacterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContacterResponse self = new ModifyContacterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContacterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContacterResponse setBody(ModifyContacterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContacterResponseBody getBody() {
        return this.body;
    }

}
