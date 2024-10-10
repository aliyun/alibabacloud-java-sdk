// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasWithUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceQuotasWithUsageResponseBody body;

    public static ListInstanceQuotasWithUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasWithUsageResponse self = new ListInstanceQuotasWithUsageResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasWithUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceQuotasWithUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceQuotasWithUsageResponse setBody(ListInstanceQuotasWithUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceQuotasWithUsageResponseBody getBody() {
        return this.body;
    }

}
