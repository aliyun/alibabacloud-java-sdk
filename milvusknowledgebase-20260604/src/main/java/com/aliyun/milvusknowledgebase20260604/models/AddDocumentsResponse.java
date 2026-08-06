// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class AddDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDocumentsResponseBody body;

    public static AddDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDocumentsResponse self = new AddDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public AddDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDocumentsResponse setBody(AddDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDocumentsResponseBody getBody() {
        return this.body;
    }

}
