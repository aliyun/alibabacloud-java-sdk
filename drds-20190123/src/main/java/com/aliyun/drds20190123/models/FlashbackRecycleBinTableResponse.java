// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class FlashbackRecycleBinTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FlashbackRecycleBinTableResponseBody body;

    public static FlashbackRecycleBinTableResponse build(java.util.Map<String, ?> map) throws Exception {
        FlashbackRecycleBinTableResponse self = new FlashbackRecycleBinTableResponse();
        return TeaModel.build(map, self);
    }

    public FlashbackRecycleBinTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlashbackRecycleBinTableResponse setBody(FlashbackRecycleBinTableResponseBody body) {
        this.body = body;
        return this;
    }
    public FlashbackRecycleBinTableResponseBody getBody() {
        return this.body;
    }

}
