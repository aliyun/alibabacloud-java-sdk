// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackendModelResponseBody body;

    public static ModifyBackendModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackendModelResponse self = new ModifyBackendModelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackendModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackendModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackendModelResponse setBody(ModifyBackendModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackendModelResponseBody getBody() {
        return this.body;
    }

}
