// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupsResponseBody body;

    public static DeleteGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupsResponse self = new DeleteGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupsResponse setBody(DeleteGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupsResponseBody getBody() {
        return this.body;
    }

}
