// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAuthorizedDataServiceApiDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedDataServiceApiDetailsResponseBody body;

    public static ListAuthorizedDataServiceApiDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDataServiceApiDetailsResponse self = new ListAuthorizedDataServiceApiDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDataServiceApiDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedDataServiceApiDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedDataServiceApiDetailsResponse setBody(ListAuthorizedDataServiceApiDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedDataServiceApiDetailsResponseBody getBody() {
        return this.body;
    }

}
