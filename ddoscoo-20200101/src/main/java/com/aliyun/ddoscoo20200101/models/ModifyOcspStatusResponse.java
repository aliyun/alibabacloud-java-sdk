// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyOcspStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOcspStatusResponseBody body;

    public static ModifyOcspStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOcspStatusResponse self = new ModifyOcspStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOcspStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOcspStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOcspStatusResponse setBody(ModifyOcspStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOcspStatusResponseBody getBody() {
        return this.body;
    }

}
