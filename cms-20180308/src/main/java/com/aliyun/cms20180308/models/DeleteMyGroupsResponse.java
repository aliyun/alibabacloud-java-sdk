// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteMyGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMyGroupsResponseBody body;

    public static DeleteMyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMyGroupsResponse self = new DeleteMyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMyGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMyGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMyGroupsResponse setBody(DeleteMyGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMyGroupsResponseBody getBody() {
        return this.body;
    }

}
