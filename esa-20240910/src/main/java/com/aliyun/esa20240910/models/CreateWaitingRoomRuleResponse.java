// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWaitingRoomRuleResponseBody body;

    public static CreateWaitingRoomRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomRuleResponse self = new CreateWaitingRoomRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWaitingRoomRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWaitingRoomRuleResponse setBody(CreateWaitingRoomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWaitingRoomRuleResponseBody getBody() {
        return this.body;
    }

}
