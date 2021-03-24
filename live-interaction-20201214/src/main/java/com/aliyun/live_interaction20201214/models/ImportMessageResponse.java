// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportMessageResponseBody body;

    public static ImportMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportMessageResponse self = new ImportMessageResponse();
        return TeaModel.build(map, self);
    }

    public ImportMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportMessageResponse setBody(ImportMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportMessageResponseBody getBody() {
        return this.body;
    }

}
