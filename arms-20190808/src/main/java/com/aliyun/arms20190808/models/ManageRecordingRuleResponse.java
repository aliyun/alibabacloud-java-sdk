// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageRecordingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ManageRecordingRuleResponseBody body;

    public static ManageRecordingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageRecordingRuleResponse self = new ManageRecordingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ManageRecordingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageRecordingRuleResponse setBody(ManageRecordingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageRecordingRuleResponseBody getBody() {
        return this.body;
    }

}
