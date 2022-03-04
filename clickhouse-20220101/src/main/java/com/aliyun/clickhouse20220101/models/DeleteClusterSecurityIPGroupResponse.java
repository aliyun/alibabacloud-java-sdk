// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteClusterSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterSecurityIPGroupResponseBody body;

    public static DeleteClusterSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterSecurityIPGroupResponse self = new DeleteClusterSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterSecurityIPGroupResponse setBody(DeleteClusterSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
