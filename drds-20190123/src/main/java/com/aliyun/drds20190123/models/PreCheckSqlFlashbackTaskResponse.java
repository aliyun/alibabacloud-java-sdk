// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PreCheckSqlFlashbackTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreCheckSqlFlashbackTaskResponseBody body;

    public static PreCheckSqlFlashbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckSqlFlashbackTaskResponse self = new PreCheckSqlFlashbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckSqlFlashbackTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckSqlFlashbackTaskResponse setBody(PreCheckSqlFlashbackTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckSqlFlashbackTaskResponseBody getBody() {
        return this.body;
    }

}
