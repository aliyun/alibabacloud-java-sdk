// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatCustomImportPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MyCatCustomImportPreCheckResponseBody body;

    public static MyCatCustomImportPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        MyCatCustomImportPreCheckResponse self = new MyCatCustomImportPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public MyCatCustomImportPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MyCatCustomImportPreCheckResponse setBody(MyCatCustomImportPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public MyCatCustomImportPreCheckResponseBody getBody() {
        return this.body;
    }

}
