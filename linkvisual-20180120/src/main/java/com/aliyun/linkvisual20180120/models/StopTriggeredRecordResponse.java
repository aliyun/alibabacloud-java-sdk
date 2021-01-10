// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopTriggeredRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTriggeredRecordResponseBody body;

    public static StopTriggeredRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTriggeredRecordResponse self = new StopTriggeredRecordResponse();
        return TeaModel.build(map, self);
    }

    public StopTriggeredRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTriggeredRecordResponse setBody(StopTriggeredRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTriggeredRecordResponseBody getBody() {
        return this.body;
    }

}
