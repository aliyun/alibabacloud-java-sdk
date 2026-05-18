// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDocumentChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDocumentChunksResponseBody body;

    public static ListDocumentChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentChunksResponse self = new ListDocumentChunksResponse();
        return TeaModel.build(map, self);
    }

    public ListDocumentChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocumentChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocumentChunksResponse setBody(ListDocumentChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocumentChunksResponseBody getBody() {
        return this.body;
    }

}
