// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportCustomCallTaggingResponseBody body;

    public static ImportCustomCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomCallTaggingResponse self = new ImportCustomCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public ImportCustomCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportCustomCallTaggingResponse setBody(ImportCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}
