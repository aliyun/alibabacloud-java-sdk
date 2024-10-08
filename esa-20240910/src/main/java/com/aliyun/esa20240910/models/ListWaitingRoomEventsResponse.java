// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWaitingRoomEventsResponseBody body;

    public static ListWaitingRoomEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomEventsResponse self = new ListWaitingRoomEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWaitingRoomEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWaitingRoomEventsResponse setBody(ListWaitingRoomEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWaitingRoomEventsResponseBody getBody() {
        return this.body;
    }

}
