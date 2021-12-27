// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddRecordingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddRecordingRuleResponse setBody(AddRecordingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecordingRuleResponseBody getBody() {
        return this.body;
    }

}
