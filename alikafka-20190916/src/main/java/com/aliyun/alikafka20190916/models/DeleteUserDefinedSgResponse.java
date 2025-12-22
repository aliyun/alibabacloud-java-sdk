// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteUserDefinedSgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserDefinedSgResponseBody body;

    public static DeleteUserDefinedSgResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefinedSgResponse self = new DeleteUserDefinedSgResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefinedSgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserDefinedSgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserDefinedSgResponse setBody(DeleteUserDefinedSgResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserDefinedSgResponseBody getBody() {
        return this.body;
    }

}
