// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDocumentRetrieveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDocumentRetrieveResponseBody body;

    public static ListDocumentRetrieveResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentRetrieveResponse self = new ListDocumentRetrieveResponse();
        return TeaModel.build(map, self);
    }

    public ListDocumentRetrieveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocumentRetrieveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocumentRetrieveResponse setBody(ListDocumentRetrieveResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocumentRetrieveResponseBody getBody() {
        return this.body;
    }

}
