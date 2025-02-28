// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyMajorCustomerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMajorCustomerResponseBody body;

    public static ModifyMajorCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorCustomerResponse self = new ModifyMajorCustomerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMajorCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMajorCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMajorCustomerResponse setBody(ModifyMajorCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMajorCustomerResponseBody getBody() {
        return this.body;
    }

}
