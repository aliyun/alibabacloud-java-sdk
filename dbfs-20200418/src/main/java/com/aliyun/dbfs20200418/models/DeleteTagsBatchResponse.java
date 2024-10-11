// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteTagsBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTagsBatchResponseBody body;

    public static DeleteTagsBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsBatchResponse self = new DeleteTagsBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagsBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagsBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagsBatchResponse setBody(DeleteTagsBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagsBatchResponseBody getBody() {
        return this.body;
    }

}
