// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListAlertGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertGroupsResponseBody body;

    public static ListAlertGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertGroupsResponse self = new ListAlertGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertGroupsResponse setBody(ListAlertGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertGroupsResponseBody getBody() {
        return this.body;
    }

}
