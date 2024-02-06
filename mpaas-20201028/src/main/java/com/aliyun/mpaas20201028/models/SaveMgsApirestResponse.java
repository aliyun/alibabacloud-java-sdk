// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveMgsApirestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveMgsApirestResponseBody body;

    public static SaveMgsApirestResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMgsApirestResponse self = new SaveMgsApirestResponse();
        return TeaModel.build(map, self);
    }

    public SaveMgsApirestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMgsApirestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveMgsApirestResponse setBody(SaveMgsApirestResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMgsApirestResponseBody getBody() {
        return this.body;
    }

}
