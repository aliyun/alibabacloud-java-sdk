// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergNamespaceDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIcebergNamespaceDetailsResponseBody body;

    public static ListIcebergNamespaceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergNamespaceDetailsResponse self = new ListIcebergNamespaceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListIcebergNamespaceDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIcebergNamespaceDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIcebergNamespaceDetailsResponse setBody(ListIcebergNamespaceDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIcebergNamespaceDetailsResponseBody getBody() {
        return this.body;
    }

}
