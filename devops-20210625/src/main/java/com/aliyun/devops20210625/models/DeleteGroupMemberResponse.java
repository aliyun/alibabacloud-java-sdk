// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupMemberResponseBody body;

    public static DeleteGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupMemberResponse self = new DeleteGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupMemberResponse setBody(DeleteGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupMemberResponseBody getBody() {
        return this.body;
    }

}
