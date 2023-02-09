// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListDumpMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDumpMetaResponseBody body;

    public static ListDumpMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDumpMetaResponse self = new ListDumpMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListDumpMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDumpMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDumpMetaResponse setBody(ListDumpMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDumpMetaResponseBody getBody() {
        return this.body;
    }

}
