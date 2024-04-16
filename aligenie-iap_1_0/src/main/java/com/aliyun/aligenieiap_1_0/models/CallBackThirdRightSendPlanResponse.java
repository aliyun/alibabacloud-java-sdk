// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CallBackThirdRightSendPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CallBackThirdRightSendPlanResponseBody body;

    public static CallBackThirdRightSendPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CallBackThirdRightSendPlanResponse self = new CallBackThirdRightSendPlanResponse();
        return TeaModel.build(map, self);
    }

    public CallBackThirdRightSendPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallBackThirdRightSendPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CallBackThirdRightSendPlanResponse setBody(CallBackThirdRightSendPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CallBackThirdRightSendPlanResponseBody getBody() {
        return this.body;
    }

}
