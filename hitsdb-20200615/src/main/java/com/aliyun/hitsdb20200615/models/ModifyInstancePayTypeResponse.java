// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyInstancePayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstancePayTypeResponseBody body;

    public static ModifyInstancePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancePayTypeResponse self = new ModifyInstancePayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstancePayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstancePayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstancePayTypeResponse setBody(ModifyInstancePayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstancePayTypeResponseBody getBody() {
        return this.body;
    }

}
