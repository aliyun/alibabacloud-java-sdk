// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddRecordingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRecordingRuleResponseBody body;

    public static AddRecordingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecordingRuleResponse self = new AddRecordingRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddRecordingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecordingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecordingRuleResponse setBody(AddRecordingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecordingRuleResponseBody getBody() {
        return this.body;
    }

}
