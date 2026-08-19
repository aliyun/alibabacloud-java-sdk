// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeletePrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeletePrivateAccessApplicationResponseBody body;

    public static BatchDeletePrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePrivateAccessApplicationResponse self = new BatchDeletePrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeletePrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeletePrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeletePrivateAccessApplicationResponse setBody(BatchDeletePrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeletePrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
