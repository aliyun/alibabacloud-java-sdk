// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyCompactionServiceSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCompactionServiceSwitchResponseBody body;

    public static ModifyCompactionServiceSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCompactionServiceSwitchResponse self = new ModifyCompactionServiceSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCompactionServiceSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCompactionServiceSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCompactionServiceSwitchResponse setBody(ModifyCompactionServiceSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCompactionServiceSwitchResponseBody getBody() {
        return this.body;
    }

}
