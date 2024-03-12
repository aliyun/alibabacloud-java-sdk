// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsResponseBody body;

    public static ListApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponse self = new ListApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsResponse setBody(ListApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsResponseBody getBody() {
        return this.body;
    }

}
