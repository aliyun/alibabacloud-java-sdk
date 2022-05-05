// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageGetRecordingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ManageGetRecordingRuleResponseBody body;

    public static ManageGetRecordingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageGetRecordingRuleResponse self = new ManageGetRecordingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ManageGetRecordingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageGetRecordingRuleResponse setBody(ManageGetRecordingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageGetRecordingRuleResponseBody getBody() {
        return this.body;
    }

}
