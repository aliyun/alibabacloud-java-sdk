// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListAlarmHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlarmHistoryResponseBody body;

    public static ListAlarmHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoryResponse self = new ListAlarmHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlarmHistoryResponse setBody(ListAlarmHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmHistoryResponseBody getBody() {
        return this.body;
    }

}
