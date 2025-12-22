// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListViewDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListViewDetailsResponseBody body;

    public static ListViewDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListViewDetailsResponse self = new ListViewDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListViewDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListViewDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListViewDetailsResponse setBody(ListViewDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListViewDetailsResponseBody getBody() {
        return this.body;
    }

}
