// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivateAccessApplicationsResponseBody body;

    public static ListPrivateAccessApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsResponse self = new ListPrivateAccessApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateAccessApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateAccessApplicationsResponse setBody(ListPrivateAccessApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateAccessApplicationsResponseBody getBody() {
        return this.body;
    }

}
