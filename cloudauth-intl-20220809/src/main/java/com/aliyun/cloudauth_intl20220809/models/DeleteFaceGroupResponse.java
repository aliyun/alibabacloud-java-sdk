// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceGroupResponseBody body;

    public static DeleteFaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceGroupResponse self = new DeleteFaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceGroupResponse setBody(DeleteFaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceGroupResponseBody getBody() {
        return this.body;
    }

}
