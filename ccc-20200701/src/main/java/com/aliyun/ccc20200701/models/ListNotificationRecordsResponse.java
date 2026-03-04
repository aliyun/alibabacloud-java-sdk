// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListNotificationRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNotificationRecordsResponseBody body;

    public static ListNotificationRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationRecordsResponse self = new ListNotificationRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListNotificationRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotificationRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNotificationRecordsResponse setBody(ListNotificationRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotificationRecordsResponseBody getBody() {
        return this.body;
    }

}
