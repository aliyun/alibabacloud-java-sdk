// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDocsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDocsResponseBody body;

    public static DeleteDocsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocsResponse self = new DeleteDocsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocsResponse setBody(DeleteDocsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocsResponseBody getBody() {
        return this.body;
    }

}
