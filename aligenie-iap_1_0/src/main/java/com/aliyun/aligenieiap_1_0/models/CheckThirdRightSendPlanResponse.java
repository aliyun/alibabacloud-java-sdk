// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CheckThirdRightSendPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckThirdRightSendPlanResponseBody body;

    public static CheckThirdRightSendPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckThirdRightSendPlanResponse self = new CheckThirdRightSendPlanResponse();
        return TeaModel.build(map, self);
    }

    public CheckThirdRightSendPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckThirdRightSendPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckThirdRightSendPlanResponse setBody(CheckThirdRightSendPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckThirdRightSendPlanResponseBody getBody() {
        return this.body;
    }

}
