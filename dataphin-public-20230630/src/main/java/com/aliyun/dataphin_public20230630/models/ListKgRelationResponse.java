// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListKgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKgRelationResponseBody body;

    public static ListKgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKgRelationResponse self = new ListKgRelationResponse();
        return TeaModel.build(map, self);
    }

    public ListKgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKgRelationResponse setBody(ListKgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKgRelationResponseBody getBody() {
        return this.body;
    }

}
