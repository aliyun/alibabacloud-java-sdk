// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ListServiceQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceQuotasResponseBody body;

    public static ListServiceQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQuotasResponse self = new ListServiceQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceQuotasResponse setBody(ListServiceQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceQuotasResponseBody getBody() {
        return this.body;
    }

}
