// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceSharedAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceSharedAccountsResponseBody body;

    public static ListServiceSharedAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSharedAccountsResponse self = new ListServiceSharedAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceSharedAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceSharedAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceSharedAccountsResponse setBody(ListServiceSharedAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceSharedAccountsResponseBody getBody() {
        return this.body;
    }

}
