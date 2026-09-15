// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLumaNamespacesResponseBody body;

    public static ListLumaNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLumaNamespacesResponse self = new ListLumaNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListLumaNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLumaNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLumaNamespacesResponse setBody(ListLumaNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLumaNamespacesResponseBody getBody() {
        return this.body;
    }

}
