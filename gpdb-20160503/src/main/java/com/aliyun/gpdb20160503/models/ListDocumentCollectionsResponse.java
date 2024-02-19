// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDocumentCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDocumentCollectionsResponseBody body;

    public static ListDocumentCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentCollectionsResponse self = new ListDocumentCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDocumentCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocumentCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocumentCollectionsResponse setBody(ListDocumentCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocumentCollectionsResponseBody getBody() {
        return this.body;
    }

}
