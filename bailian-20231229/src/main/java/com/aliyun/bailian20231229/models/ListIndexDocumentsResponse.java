// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIndexDocumentsResponseBody body;

    public static ListIndexDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexDocumentsResponse self = new ListIndexDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndexDocumentsResponse setBody(ListIndexDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexDocumentsResponseBody getBody() {
        return this.body;
    }

}
