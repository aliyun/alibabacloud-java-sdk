// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourcesResponseBody body;

    public static ListResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponse self = new ListResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcesResponse setBody(ListResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesResponseBody getBody() {
        return this.body;
    }

}
