// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListAllEndEntityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllEndEntityInstanceResponseBody body;

    public static ListAllEndEntityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllEndEntityInstanceResponse self = new ListAllEndEntityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListAllEndEntityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllEndEntityInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllEndEntityInstanceResponse setBody(ListAllEndEntityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllEndEntityInstanceResponseBody getBody() {
        return this.body;
    }

}
