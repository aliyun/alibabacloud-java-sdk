// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PostEmonTryAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostEmonTryAlarmRuleResponseBody body;

    public static PostEmonTryAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PostEmonTryAlarmRuleResponse self = new PostEmonTryAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public PostEmonTryAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostEmonTryAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostEmonTryAlarmRuleResponse setBody(PostEmonTryAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PostEmonTryAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
