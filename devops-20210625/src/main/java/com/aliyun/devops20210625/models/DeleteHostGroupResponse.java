// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHostGroupResponseBody body;

    public static DeleteHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostGroupResponse self = new DeleteHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHostGroupResponse setBody(DeleteHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostGroupResponseBody getBody() {
        return this.body;
    }

}
