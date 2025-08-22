// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListExternalApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalApplicationsResponseBody body;

    public static ListExternalApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalApplicationsResponse self = new ListExternalApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalApplicationsResponse setBody(ListExternalApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalApplicationsResponseBody getBody() {
        return this.body;
    }

}
