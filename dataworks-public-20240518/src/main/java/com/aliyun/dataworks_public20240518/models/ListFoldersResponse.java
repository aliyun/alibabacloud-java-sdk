// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFoldersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFoldersResponseBody body;

    public static ListFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersResponse self = new ListFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoldersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFoldersResponse setBody(ListFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoldersResponseBody getBody() {
        return this.body;
    }

}
