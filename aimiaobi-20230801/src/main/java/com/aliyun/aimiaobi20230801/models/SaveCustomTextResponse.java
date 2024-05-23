// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveCustomTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveCustomTextResponseBody body;

    public static SaveCustomTextResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCustomTextResponse self = new SaveCustomTextResponse();
        return TeaModel.build(map, self);
    }

    public SaveCustomTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCustomTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveCustomTextResponse setBody(SaveCustomTextResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCustomTextResponseBody getBody() {
        return this.body;
    }

}
