// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageRecordingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ManageRecordingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageRecordingRuleResponse setBody(ManageRecordingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageRecordingRuleResponseBody getBody() {
        return this.body;
    }

}
