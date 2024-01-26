// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRecordingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordingRuleResponseBody body;

    public static GetRecordingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingRuleResponse self = new GetRecordingRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordingRuleResponse setBody(GetRecordingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordingRuleResponseBody getBody() {
        return this.body;
    }

}
