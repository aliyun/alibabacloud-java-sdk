// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergTableDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIcebergTableDetailsResponseBody body;

    public static ListIcebergTableDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergTableDetailsResponse self = new ListIcebergTableDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListIcebergTableDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIcebergTableDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIcebergTableDetailsResponse setBody(ListIcebergTableDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIcebergTableDetailsResponseBody getBody() {
        return this.body;
    }

}
