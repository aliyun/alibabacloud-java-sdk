// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWaitingRoomRuleResponseBody body;

    public static UpdateWaitingRoomRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomRuleResponse self = new UpdateWaitingRoomRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWaitingRoomRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWaitingRoomRuleResponse setBody(UpdateWaitingRoomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWaitingRoomRuleResponseBody getBody() {
        return this.body;
    }

}
