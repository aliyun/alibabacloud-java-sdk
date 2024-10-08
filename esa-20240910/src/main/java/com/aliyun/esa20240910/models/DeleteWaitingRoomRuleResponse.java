// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWaitingRoomRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWaitingRoomRuleResponseBody body;

    public static DeleteWaitingRoomRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingRoomRuleResponse self = new DeleteWaitingRoomRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingRoomRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaitingRoomRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWaitingRoomRuleResponse setBody(DeleteWaitingRoomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaitingRoomRuleResponseBody getBody() {
        return this.body;
    }

}
