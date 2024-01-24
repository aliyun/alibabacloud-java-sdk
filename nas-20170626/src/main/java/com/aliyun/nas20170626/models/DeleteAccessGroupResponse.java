// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessGroupResponseBody body;

    public static DeleteAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessGroupResponse self = new DeleteAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessGroupResponse setBody(DeleteAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessGroupResponseBody getBody() {
        return this.body;
    }

}
