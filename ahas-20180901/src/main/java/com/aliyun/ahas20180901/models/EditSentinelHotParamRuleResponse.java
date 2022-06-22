// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EditSentinelHotParamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditSentinelHotParamRuleResponseBody body;

    public static EditSentinelHotParamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditSentinelHotParamRuleResponse self = new EditSentinelHotParamRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditSentinelHotParamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditSentinelHotParamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditSentinelHotParamRuleResponse setBody(EditSentinelHotParamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EditSentinelHotParamRuleResponseBody getBody() {
        return this.body;
    }

}
