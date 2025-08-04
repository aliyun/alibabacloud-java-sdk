// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexFileDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIndexFileDetailsResponseBody body;

    public static ListIndexFileDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexFileDetailsResponse self = new ListIndexFileDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexFileDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexFileDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndexFileDetailsResponse setBody(ListIndexFileDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexFileDetailsResponseBody getBody() {
        return this.body;
    }

}
