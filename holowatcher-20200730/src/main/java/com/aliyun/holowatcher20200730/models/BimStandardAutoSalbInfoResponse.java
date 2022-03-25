// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimStandardAutoSalbInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BimStandardAutoSalbInfoResponseBody body;

    public static BimStandardAutoSalbInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BimStandardAutoSalbInfoResponse self = new BimStandardAutoSalbInfoResponse();
        return TeaModel.build(map, self);
    }

    public BimStandardAutoSalbInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimStandardAutoSalbInfoResponse setBody(BimStandardAutoSalbInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public BimStandardAutoSalbInfoResponseBody getBody() {
        return this.body;
    }

}
