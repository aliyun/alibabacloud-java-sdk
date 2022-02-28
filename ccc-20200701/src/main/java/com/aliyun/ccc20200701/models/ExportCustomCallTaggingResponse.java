// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportCustomCallTaggingResponseBody body;

    public static ExportCustomCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomCallTaggingResponse self = new ExportCustomCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public ExportCustomCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCustomCallTaggingResponse setBody(ExportCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}
