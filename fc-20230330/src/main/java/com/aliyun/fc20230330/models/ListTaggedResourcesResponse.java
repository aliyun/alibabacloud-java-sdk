// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaggedResourcesOutput body;

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

    public ListTaggedResourcesResponse setBody(ListTaggedResourcesOutput body) {
        this.body = body;
        return this;
    }
    public ListTaggedResourcesOutput getBody() {
        return this.body;
    }

}
