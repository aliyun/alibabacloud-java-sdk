// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteQuickQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQuickQueryResponseBody body;

    public static DeleteQuickQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuickQueryResponse self = new DeleteQuickQueryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQuickQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQuickQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQuickQueryResponse setBody(DeleteQuickQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQuickQueryResponseBody getBody() {
        return this.body;
    }

}
