// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCenAttributeResponseBody body;

    public static ModifyCenAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenAttributeResponse self = new ModifyCenAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCenAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCenAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCenAttributeResponse setBody(ModifyCenAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenAttributeResponseBody getBody() {
        return this.body;
    }

}
