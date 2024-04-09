// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteRdMemberListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRdMemberListResponseBody body;

    public static DeleteRdMemberListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdMemberListResponse self = new DeleteRdMemberListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRdMemberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRdMemberListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRdMemberListResponse setBody(DeleteRdMemberListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRdMemberListResponseBody getBody() {
        return this.body;
    }

}
