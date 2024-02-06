// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListAlertTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertTemplatesResponseBody body;

    public static ListAlertTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertTemplatesResponse self = new ListAlertTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertTemplatesResponse setBody(ListAlertTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertTemplatesResponseBody getBody() {
        return this.body;
    }

}
