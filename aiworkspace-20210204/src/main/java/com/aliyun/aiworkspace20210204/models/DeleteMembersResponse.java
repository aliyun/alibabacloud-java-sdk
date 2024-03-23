// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMembersResponseBody body;

    public static DeleteMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMembersResponse self = new DeleteMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMembersResponse setBody(DeleteMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMembersResponseBody getBody() {
        return this.body;
    }

}
