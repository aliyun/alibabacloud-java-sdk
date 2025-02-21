// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListAivppResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAivppResourcesResponseBody body;

    public static ListAivppResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAivppResourcesResponse self = new ListAivppResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAivppResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAivppResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAivppResourcesResponse setBody(ListAivppResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAivppResourcesResponseBody getBody() {
        return this.body;
    }

}
