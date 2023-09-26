// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RecoveryApiDefineFromHistoricalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecoveryApiDefineFromHistoricalResponseBody body;

    public static RecoveryApiDefineFromHistoricalResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoveryApiDefineFromHistoricalResponse self = new RecoveryApiDefineFromHistoricalResponse();
        return TeaModel.build(map, self);
    }

    public RecoveryApiDefineFromHistoricalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoveryApiDefineFromHistoricalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoveryApiDefineFromHistoricalResponse setBody(RecoveryApiDefineFromHistoricalResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoveryApiDefineFromHistoricalResponseBody getBody() {
        return this.body;
    }

}
