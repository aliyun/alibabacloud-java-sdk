// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListLogicalModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogicalModelsResponseBody body;

    public static ListLogicalModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogicalModelsResponse self = new ListLogicalModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogicalModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogicalModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogicalModelsResponse setBody(ListLogicalModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogicalModelsResponseBody getBody() {
        return this.body;
    }

}
