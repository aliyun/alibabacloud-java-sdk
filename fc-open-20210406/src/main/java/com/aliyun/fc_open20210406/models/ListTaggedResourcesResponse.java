// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaggedResourcesResponseBody body;

    public static ListTaggedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesResponse self = new ListTaggedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaggedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaggedResourcesResponse setBody(ListTaggedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaggedResourcesResponseBody getBody() {
        return this.body;
    }

}
