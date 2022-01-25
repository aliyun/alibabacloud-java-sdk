// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveRecordTaskResponseBody body;

    public static UpdateLiveRecordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTaskResponse self = new UpdateLiveRecordTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveRecordTaskResponse setBody(UpdateLiveRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveRecordTaskResponseBody getBody() {
        return this.body;
    }

}
