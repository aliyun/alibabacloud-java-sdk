// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLumaDocumentsResponseBody body;

    public static ListLumaDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLumaDocumentsResponse self = new ListLumaDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ListLumaDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLumaDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLumaDocumentsResponse setBody(ListLumaDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLumaDocumentsResponseBody getBody() {
        return this.body;
    }

}
