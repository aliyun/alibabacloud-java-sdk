// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateJobResponseBody body;

    public static UpdateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobResponse self = new UpdateJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobResponse setBody(UpdateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobResponseBody getBody() {
        return this.body;
    }

}
