// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContactGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactGroupsResponseBody body;

    public static DeleteContactGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupsResponse self = new DeleteContactGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactGroupsResponse setBody(DeleteContactGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactGroupsResponseBody getBody() {
        return this.body;
    }

}
