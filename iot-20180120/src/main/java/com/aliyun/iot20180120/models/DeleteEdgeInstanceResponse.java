// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEdgeInstanceResponseBody body;

    public static DeleteEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeInstanceResponse self = new DeleteEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeInstanceResponse setBody(DeleteEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
