// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotasPlansResponseBody body;

    public static ListQuotasPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasPlansResponse self = new ListQuotasPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotasPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotasPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotasPlansResponse setBody(ListQuotasPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotasPlansResponseBody getBody() {
        return this.body;
    }

}
