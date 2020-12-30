// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class UpdateTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTagResponseBody body;

    public static UpdateTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagResponse self = new UpdateTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTagResponse setBody(UpdateTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTagResponseBody getBody() {
        return this.body;
    }

}
