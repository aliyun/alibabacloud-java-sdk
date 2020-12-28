// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGWSClusterResponseBody body;

    public static DeleteGWSClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSClusterResponse self = new DeleteGWSClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGWSClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGWSClusterResponse setBody(DeleteGWSClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGWSClusterResponseBody getBody() {
        return this.body;
    }

}
