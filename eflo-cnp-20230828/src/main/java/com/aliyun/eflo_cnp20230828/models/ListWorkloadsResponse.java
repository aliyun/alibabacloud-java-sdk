// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListWorkloadsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkloadsResponseBody body;

    public static ListWorkloadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkloadsResponse self = new ListWorkloadsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkloadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkloadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkloadsResponse setBody(ListWorkloadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkloadsResponseBody getBody() {
        return this.body;
    }

}
