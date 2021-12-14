// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Get400CorpPdfOssUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Get400CorpPdfOssUrlResponseBody body;

    public static Get400CorpPdfOssUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        Get400CorpPdfOssUrlResponse self = new Get400CorpPdfOssUrlResponse();
        return TeaModel.build(map, self);
    }

    public Get400CorpPdfOssUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Get400CorpPdfOssUrlResponse setBody(Get400CorpPdfOssUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public Get400CorpPdfOssUrlResponseBody getBody() {
        return this.body;
    }

}
