// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TriggerRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerRecordResponseBody body;

    public static TriggerRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerRecordResponse self = new TriggerRecordResponse();
        return TeaModel.build(map, self);
    }

    public TriggerRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerRecordResponse setBody(TriggerRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerRecordResponseBody getBody() {
        return this.body;
    }

}
