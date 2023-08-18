// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ModifyMasterSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMasterSpecResponseBody body;

    public static ModifyMasterSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMasterSpecResponse self = new ModifyMasterSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMasterSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMasterSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMasterSpecResponse setBody(ModifyMasterSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMasterSpecResponseBody getBody() {
        return this.body;
    }

}
