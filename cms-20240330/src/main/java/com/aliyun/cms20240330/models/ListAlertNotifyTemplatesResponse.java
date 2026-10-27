// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertNotifyTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertNotifyTemplatesResponseBody body;

    public static ListAlertNotifyTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotifyTemplatesResponse self = new ListAlertNotifyTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertNotifyTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertNotifyTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertNotifyTemplatesResponse setBody(ListAlertNotifyTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertNotifyTemplatesResponseBody getBody() {
        return this.body;
    }

}
