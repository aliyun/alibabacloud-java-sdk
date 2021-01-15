// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeletePhysicalSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePhysicalSpaceResponseBody body;

    public static DeletePhysicalSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalSpaceResponse self = new DeletePhysicalSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhysicalSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhysicalSpaceResponse setBody(DeletePhysicalSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhysicalSpaceResponseBody getBody() {
        return this.body;
    }

}
