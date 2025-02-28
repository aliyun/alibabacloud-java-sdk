// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyServiceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyServiceQuotaResponseBody body;

    public static ModifyServiceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceQuotaResponse self = new ModifyServiceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ModifyServiceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyServiceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyServiceQuotaResponse setBody(ModifyServiceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyServiceQuotaResponseBody getBody() {
        return this.body;
    }

}
