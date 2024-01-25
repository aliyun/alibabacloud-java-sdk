// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivateAccessTagsResponseBody body;

    public static ListPrivateAccessTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessTagsResponse self = new ListPrivateAccessTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateAccessTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateAccessTagsResponse setBody(ListPrivateAccessTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateAccessTagsResponseBody getBody() {
        return this.body;
    }

}
