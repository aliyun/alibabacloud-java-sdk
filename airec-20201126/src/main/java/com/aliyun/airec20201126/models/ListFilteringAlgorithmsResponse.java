// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFilteringAlgorithmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFilteringAlgorithmsResponseBody body;

    public static ListFilteringAlgorithmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFilteringAlgorithmsResponse self = new ListFilteringAlgorithmsResponse();
        return TeaModel.build(map, self);
    }

    public ListFilteringAlgorithmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFilteringAlgorithmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFilteringAlgorithmsResponse setBody(ListFilteringAlgorithmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFilteringAlgorithmsResponseBody getBody() {
        return this.body;
    }

}
