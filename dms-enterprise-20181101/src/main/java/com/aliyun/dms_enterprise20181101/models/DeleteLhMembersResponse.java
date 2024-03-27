// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLhMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLhMembersResponseBody body;

    public static DeleteLhMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLhMembersResponse self = new DeleteLhMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLhMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLhMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLhMembersResponse setBody(DeleteLhMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLhMembersResponseBody getBody() {
        return this.body;
    }

}
