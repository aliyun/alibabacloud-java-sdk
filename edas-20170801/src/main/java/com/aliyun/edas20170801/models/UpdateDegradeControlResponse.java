// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateDegradeControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDegradeControlResponseBody body;

    public static UpdateDegradeControlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDegradeControlResponse self = new UpdateDegradeControlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDegradeControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDegradeControlResponse setBody(UpdateDegradeControlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDegradeControlResponseBody getBody() {
        return this.body;
    }

}
