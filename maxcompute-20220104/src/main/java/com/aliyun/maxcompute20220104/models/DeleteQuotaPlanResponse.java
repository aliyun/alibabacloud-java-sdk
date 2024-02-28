// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQuotaPlanResponseBody body;

    public static DeleteQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaPlanResponse self = new DeleteQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQuotaPlanResponse setBody(DeleteQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
