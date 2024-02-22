// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListDocsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDocsResponseBody body;

    public static ListDocsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocsResponse self = new ListDocsResponse();
        return TeaModel.build(map, self);
    }

    public ListDocsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocsResponse setBody(ListDocsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocsResponseBody getBody() {
        return this.body;
    }

}
