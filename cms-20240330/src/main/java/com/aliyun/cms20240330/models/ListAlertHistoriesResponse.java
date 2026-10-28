// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertHistoriesResponseBody body;

    public static ListAlertHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertHistoriesResponse self = new ListAlertHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertHistoriesResponse setBody(ListAlertHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertHistoriesResponseBody getBody() {
        return this.body;
    }

}
