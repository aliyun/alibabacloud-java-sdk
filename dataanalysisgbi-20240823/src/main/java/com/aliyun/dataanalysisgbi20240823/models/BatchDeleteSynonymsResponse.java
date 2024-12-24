// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class BatchDeleteSynonymsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteSynonymsResponseBody body;

    public static BatchDeleteSynonymsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSynonymsResponse self = new BatchDeleteSynonymsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSynonymsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteSynonymsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteSynonymsResponse setBody(BatchDeleteSynonymsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteSynonymsResponseBody getBody() {
        return this.body;
    }

}
