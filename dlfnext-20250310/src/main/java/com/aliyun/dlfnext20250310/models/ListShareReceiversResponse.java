// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListShareReceiversResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShareReceiversResponseBody body;

    public static ListShareReceiversResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShareReceiversResponse self = new ListShareReceiversResponse();
        return TeaModel.build(map, self);
    }

    public ListShareReceiversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShareReceiversResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShareReceiversResponse setBody(ListShareReceiversResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShareReceiversResponseBody getBody() {
        return this.body;
    }

}
