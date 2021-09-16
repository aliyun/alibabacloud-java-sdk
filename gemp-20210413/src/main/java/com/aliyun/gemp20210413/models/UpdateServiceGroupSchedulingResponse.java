// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceGroupSchedulingResponseBody body;

    public static UpdateServiceGroupSchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSchedulingResponse self = new UpdateServiceGroupSchedulingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceGroupSchedulingResponse setBody(UpdateServiceGroupSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

}
