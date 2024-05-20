// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListUserSuppressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserSuppressionResponseBody body;

    public static ListUserSuppressionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserSuppressionResponse self = new ListUserSuppressionResponse();
        return TeaModel.build(map, self);
    }

    public ListUserSuppressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserSuppressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserSuppressionResponse setBody(ListUserSuppressionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserSuppressionResponseBody getBody() {
        return this.body;
    }

}
