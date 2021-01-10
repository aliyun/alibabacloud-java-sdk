// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDetectProcessResponseBody body;

    public static UpdateDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectProcessResponse self = new UpdateDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDetectProcessResponse setBody(UpdateDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDetectProcessResponseBody getBody() {
        return this.body;
    }

}
