// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertActionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertActionsResponseBody body;

    public static ListAlertActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertActionsResponse self = new ListAlertActionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertActionsResponse setBody(ListAlertActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertActionsResponseBody getBody() {
        return this.body;
    }

}
