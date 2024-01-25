// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyModelResponseBody body;

    public static ModifyModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelResponse self = new ModifyModelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyModelResponse setBody(ModifyModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyModelResponseBody getBody() {
        return this.body;
    }

}
