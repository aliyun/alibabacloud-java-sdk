// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBatchTemplateResponseBody body;

    public static UpdateBatchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTemplateResponse self = new UpdateBatchTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBatchTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBatchTemplateResponse setBody(UpdateBatchTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBatchTemplateResponseBody getBody() {
        return this.body;
    }

}
