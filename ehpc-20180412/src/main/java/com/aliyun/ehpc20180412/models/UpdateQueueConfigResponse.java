// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateQueueConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateQueueConfigResponseBody body;

    public static UpdateQueueConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueConfigResponse self = new UpdateQueueConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQueueConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQueueConfigResponse setBody(UpdateQueueConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQueueConfigResponseBody getBody() {
        return this.body;
    }

}
