// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFaceEntitiesResponseBody body;

    public static ListFaceEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceEntitiesResponse self = new ListFaceEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaceEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFaceEntitiesResponse setBody(ListFaceEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaceEntitiesResponseBody getBody() {
        return this.body;
    }

}
