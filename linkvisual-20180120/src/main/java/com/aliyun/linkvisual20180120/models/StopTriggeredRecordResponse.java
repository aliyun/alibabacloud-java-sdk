// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopTriggeredRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StopTriggeredRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTriggeredRecordResponse setBody(StopTriggeredRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTriggeredRecordResponseBody getBody() {
        return this.body;
    }

}
