// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveOssServeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveOssServeResponseBody body;

    public static SaveOssServeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOssServeResponse self = new SaveOssServeResponse();
        return TeaModel.build(map, self);
    }

    public SaveOssServeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOssServeResponse setBody(SaveOssServeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOssServeResponseBody getBody() {
        return this.body;
    }

}
