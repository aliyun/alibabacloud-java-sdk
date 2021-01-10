// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEdgeDriverVersionResponseBody body;

    public static DeleteEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeDriverVersionResponse self = new DeleteEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeDriverVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeDriverVersionResponse setBody(DeleteEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
