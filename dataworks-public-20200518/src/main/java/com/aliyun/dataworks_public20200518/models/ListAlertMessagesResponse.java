// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertMessagesResponseBody body;

    public static ListAlertMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesResponse self = new ListAlertMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertMessagesResponse setBody(ListAlertMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertMessagesResponseBody getBody() {
        return this.body;
    }

}
