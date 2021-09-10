// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNodeOwnerResponseBody body;

    public static UpdateNodeOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOwnerResponse self = new UpdateNodeOwnerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeOwnerResponse setBody(UpdateNodeOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeOwnerResponseBody getBody() {
        return this.body;
    }

}
