// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWaitingRoomRulesResponseBody body;

    public static ListWaitingRoomRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomRulesResponse self = new ListWaitingRoomRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWaitingRoomRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWaitingRoomRulesResponse setBody(ListWaitingRoomRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWaitingRoomRulesResponseBody getBody() {
        return this.body;
    }

}
