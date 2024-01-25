// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackendResponseBody body;

    public static ModifyBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackendResponse self = new ModifyBackendResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackendResponse setBody(ModifyBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackendResponseBody getBody() {
        return this.body;
    }

}
