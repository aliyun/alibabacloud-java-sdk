// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupportModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportModelsResponseBody body;

    public static ListSupportModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportModelsResponse self = new ListSupportModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportModelsResponse setBody(ListSupportModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportModelsResponseBody getBody() {
        return this.body;
    }

}
