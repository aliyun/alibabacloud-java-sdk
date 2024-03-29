// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteUserGroupsMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserGroupsMappingResponseBody body;

    public static DeleteUserGroupsMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupsMappingResponse self = new DeleteUserGroupsMappingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupsMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserGroupsMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserGroupsMappingResponse setBody(DeleteUserGroupsMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserGroupsMappingResponseBody getBody() {
        return this.body;
    }

}
