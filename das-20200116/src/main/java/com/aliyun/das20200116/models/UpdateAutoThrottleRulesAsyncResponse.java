// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoThrottleRulesAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoThrottleRulesAsyncResponseBody body;

    public static UpdateAutoThrottleRulesAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoThrottleRulesAsyncResponse self = new UpdateAutoThrottleRulesAsyncResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoThrottleRulesAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoThrottleRulesAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoThrottleRulesAsyncResponse setBody(UpdateAutoThrottleRulesAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoThrottleRulesAsyncResponseBody getBody() {
        return this.body;
    }

}
