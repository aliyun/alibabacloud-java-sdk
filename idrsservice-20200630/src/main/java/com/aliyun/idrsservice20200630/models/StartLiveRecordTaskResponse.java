// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StartLiveRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLiveRecordTaskResponseBody body;

    public static StartLiveRecordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveRecordTaskResponse self = new StartLiveRecordTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveRecordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLiveRecordTaskResponse setBody(StartLiveRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLiveRecordTaskResponseBody getBody() {
        return this.body;
    }

}
