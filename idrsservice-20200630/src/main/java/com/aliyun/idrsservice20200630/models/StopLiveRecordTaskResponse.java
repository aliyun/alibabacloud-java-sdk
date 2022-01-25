// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StopLiveRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLiveRecordTaskResponseBody body;

    public static StopLiveRecordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveRecordTaskResponse self = new StopLiveRecordTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveRecordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveRecordTaskResponse setBody(StopLiveRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveRecordTaskResponseBody getBody() {
        return this.body;
    }

}
