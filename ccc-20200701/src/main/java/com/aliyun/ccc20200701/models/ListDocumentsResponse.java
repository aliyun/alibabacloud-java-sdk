// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDocumentsResponseBody body;

    public static ListDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsResponse self = new ListDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocumentsResponse setBody(ListDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocumentsResponseBody getBody() {
        return this.body;
    }

}
