// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListTableDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableDetailsResponseBody body;

    public static ListTableDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableDetailsResponse self = new ListTableDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListTableDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableDetailsResponse setBody(ListTableDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableDetailsResponseBody getBody() {
        return this.body;
    }

}
