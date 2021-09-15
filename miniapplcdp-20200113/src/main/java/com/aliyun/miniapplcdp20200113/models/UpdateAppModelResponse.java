// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppModelResponseBody body;

    public static UpdateAppModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModelResponse self = new UpdateAppModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppModelResponse setBody(UpdateAppModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppModelResponseBody getBody() {
        return this.body;
    }

}
