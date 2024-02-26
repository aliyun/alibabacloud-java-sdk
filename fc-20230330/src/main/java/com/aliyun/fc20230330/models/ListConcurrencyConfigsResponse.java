// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListConcurrencyConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConcurrencyConfigsOutput body;

    public static ListConcurrencyConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConcurrencyConfigsResponse self = new ListConcurrencyConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListConcurrencyConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConcurrencyConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConcurrencyConfigsResponse setBody(ListConcurrencyConfigsOutput body) {
        this.body = body;
        return this;
    }
    public ListConcurrencyConfigsOutput getBody() {
        return this.body;
    }

}
