// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListReceiversResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReceiversResponseBody body;

    public static ListReceiversResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReceiversResponse self = new ListReceiversResponse();
        return TeaModel.build(map, self);
    }

    public ListReceiversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReceiversResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReceiversResponse setBody(ListReceiversResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReceiversResponseBody getBody() {
        return this.body;
    }

}
