// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBatchTemplateResponseBody body;

    public static SubmitBatchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTemplateResponse self = new SubmitBatchTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBatchTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBatchTemplateResponse setBody(SubmitBatchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBatchTemplateResponseBody getBody() {
        return this.body;
    }

}
