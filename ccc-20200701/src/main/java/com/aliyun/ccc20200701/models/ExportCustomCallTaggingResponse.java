// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ExportCustomCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCustomCallTaggingResponse setBody(ExportCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}
