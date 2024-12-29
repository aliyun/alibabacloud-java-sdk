// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsWorkloadNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApsWorkloadNameResponseBody body;

    public static ModifyApsWorkloadNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsWorkloadNameResponse self = new ModifyApsWorkloadNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApsWorkloadNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApsWorkloadNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApsWorkloadNameResponse setBody(ModifyApsWorkloadNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApsWorkloadNameResponseBody getBody() {
        return this.body;
    }

}
