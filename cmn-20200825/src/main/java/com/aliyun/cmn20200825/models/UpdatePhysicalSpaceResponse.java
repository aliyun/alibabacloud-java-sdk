// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePhysicalSpaceResponseBody body;

    public static UpdatePhysicalSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhysicalSpaceResponse self = new UpdatePhysicalSpaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhysicalSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhysicalSpaceResponse setBody(UpdatePhysicalSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhysicalSpaceResponseBody getBody() {
        return this.body;
    }

}
