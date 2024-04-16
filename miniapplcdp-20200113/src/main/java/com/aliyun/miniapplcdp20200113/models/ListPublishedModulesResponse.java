// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishedModulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedModulesResponseBody body;

    public static ListPublishedModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedModulesResponse self = new ListPublishedModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedModulesResponse setBody(ListPublishedModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedModulesResponseBody getBody() {
        return this.body;
    }

}
