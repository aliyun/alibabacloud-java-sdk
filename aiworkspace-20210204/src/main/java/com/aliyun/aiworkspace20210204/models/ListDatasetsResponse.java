// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasetsResponseBody body;

    public static ListDatasetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponse self = new ListDatasetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetsResponse setBody(ListDatasetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetsResponseBody getBody() {
        return this.body;
    }

}
