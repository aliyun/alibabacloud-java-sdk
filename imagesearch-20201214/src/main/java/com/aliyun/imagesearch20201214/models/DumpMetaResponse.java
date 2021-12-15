// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DumpMetaResponseBody body;

    public static DumpMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaResponse self = new DumpMetaResponse();
        return TeaModel.build(map, self);
    }

    public DumpMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DumpMetaResponse setBody(DumpMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DumpMetaResponseBody getBody() {
        return this.body;
    }

}
