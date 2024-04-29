// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortAutoCcStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPortAutoCcStatusResponseBody body;

    public static ModifyPortAutoCcStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortAutoCcStatusResponse self = new ModifyPortAutoCcStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPortAutoCcStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPortAutoCcStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPortAutoCcStatusResponse setBody(ModifyPortAutoCcStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPortAutoCcStatusResponseBody getBody() {
        return this.body;
    }

}
