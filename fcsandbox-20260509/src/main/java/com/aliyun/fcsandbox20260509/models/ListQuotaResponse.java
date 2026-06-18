// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ListQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotaResponseBody body;

    public static ListQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaResponse self = new ListQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaResponse setBody(ListQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaResponseBody getBody() {
        return this.body;
    }

}
