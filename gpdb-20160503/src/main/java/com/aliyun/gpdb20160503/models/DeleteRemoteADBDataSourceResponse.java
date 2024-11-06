// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteRemoteADBDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRemoteADBDataSourceResponseBody body;

    public static DeleteRemoteADBDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemoteADBDataSourceResponse self = new DeleteRemoteADBDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRemoteADBDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRemoteADBDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRemoteADBDataSourceResponse setBody(DeleteRemoteADBDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRemoteADBDataSourceResponseBody getBody() {
        return this.body;
    }

}
