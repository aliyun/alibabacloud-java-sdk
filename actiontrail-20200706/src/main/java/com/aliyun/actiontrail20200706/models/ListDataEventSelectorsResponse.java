// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDataEventSelectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataEventSelectorsResponseBody body;

    public static ListDataEventSelectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataEventSelectorsResponse self = new ListDataEventSelectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataEventSelectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataEventSelectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataEventSelectorsResponse setBody(ListDataEventSelectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataEventSelectorsResponseBody getBody() {
        return this.body;
    }

}
