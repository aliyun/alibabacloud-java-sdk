// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchCreateSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateSmsSignResponseBody body;

    public static BatchCreateSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSmsSignResponse self = new BatchCreateSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateSmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateSmsSignResponse setBody(BatchCreateSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateSmsSignResponseBody getBody() {
        return this.body;
    }

}
