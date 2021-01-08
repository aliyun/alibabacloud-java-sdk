// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteCommonGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCommonGroupResponseBody body;

    public static DeleteCommonGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonGroupResponse self = new DeleteCommonGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommonGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommonGroupResponse setBody(DeleteCommonGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommonGroupResponseBody getBody() {
        return this.body;
    }

}
