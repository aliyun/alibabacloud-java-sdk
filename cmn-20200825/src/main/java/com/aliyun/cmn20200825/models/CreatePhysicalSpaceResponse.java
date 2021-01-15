// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePhysicalSpaceResponseBody body;

    public static CreatePhysicalSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalSpaceResponse self = new CreatePhysicalSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhysicalSpaceResponse setBody(CreatePhysicalSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhysicalSpaceResponseBody getBody() {
        return this.body;
    }

}
