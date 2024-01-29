// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRunResponseBody body;

    public static DeleteRunResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRunResponse self = new DeleteRunResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRunResponse setBody(DeleteRunResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRunResponseBody getBody() {
        return this.body;
    }

}
