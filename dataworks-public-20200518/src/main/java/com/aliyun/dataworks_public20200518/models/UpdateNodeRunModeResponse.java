// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeRunModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNodeRunModeResponseBody body;

    public static UpdateNodeRunModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeRunModeResponse self = new UpdateNodeRunModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeRunModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeRunModeResponse setBody(UpdateNodeRunModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeRunModeResponseBody getBody() {
        return this.body;
    }

}
