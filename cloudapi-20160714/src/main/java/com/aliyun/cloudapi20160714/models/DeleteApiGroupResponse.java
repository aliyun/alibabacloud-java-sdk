// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApiGroupResponseBody body;

    public static DeleteApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiGroupResponse self = new DeleteApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiGroupResponse setBody(DeleteApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiGroupResponseBody getBody() {
        return this.body;
    }

}
