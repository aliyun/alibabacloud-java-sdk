// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasResponseBody body;

    public static ListDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasResponse self = new ListDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasResponse setBody(ListDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasResponseBody getBody() {
        return this.body;
    }

}
