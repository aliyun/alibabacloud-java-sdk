// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySlsDispatchStatusResponseBody body;

    public static ModifySlsDispatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySlsDispatchStatusResponse self = new ModifySlsDispatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifySlsDispatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySlsDispatchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySlsDispatchStatusResponse setBody(ModifySlsDispatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySlsDispatchStatusResponseBody getBody() {
        return this.body;
    }

}
