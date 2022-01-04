// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ExportQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportQueryResultResponseBody body;

    public static ExportQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportQueryResultResponse self = new ExportQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public ExportQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportQueryResultResponse setBody(ExportQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportQueryResultResponseBody getBody() {
        return this.body;
    }

}
