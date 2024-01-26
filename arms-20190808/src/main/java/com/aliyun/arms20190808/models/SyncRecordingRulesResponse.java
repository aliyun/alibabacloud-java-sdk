// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SyncRecordingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncRecordingRulesResponseBody body;

    public static SyncRecordingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRecordingRulesResponse self = new SyncRecordingRulesResponse();
        return TeaModel.build(map, self);
    }

    public SyncRecordingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncRecordingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncRecordingRulesResponse setBody(SyncRecordingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncRecordingRulesResponseBody getBody() {
        return this.body;
    }

}
