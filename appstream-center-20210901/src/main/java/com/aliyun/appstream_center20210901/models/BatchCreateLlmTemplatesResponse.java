// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BatchCreateLlmTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateLlmTemplatesResponseBody body;

    public static BatchCreateLlmTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateLlmTemplatesResponse self = new BatchCreateLlmTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateLlmTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateLlmTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateLlmTemplatesResponse setBody(BatchCreateLlmTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateLlmTemplatesResponseBody getBody() {
        return this.body;
    }

}
