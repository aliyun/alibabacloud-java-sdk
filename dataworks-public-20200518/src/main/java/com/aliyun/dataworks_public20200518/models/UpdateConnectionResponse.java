// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConnectionResponseBody body;

    public static UpdateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionResponse self = new UpdateConnectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConnectionResponse setBody(UpdateConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnectionResponseBody getBody() {
        return this.body;
    }

}
