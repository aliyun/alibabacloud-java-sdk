// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertNotificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertNotificationsResponseBody body;

    public static ListAlertNotificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotificationsResponse self = new ListAlertNotificationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertNotificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertNotificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertNotificationsResponse setBody(ListAlertNotificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertNotificationsResponseBody getBody() {
        return this.body;
    }

}
