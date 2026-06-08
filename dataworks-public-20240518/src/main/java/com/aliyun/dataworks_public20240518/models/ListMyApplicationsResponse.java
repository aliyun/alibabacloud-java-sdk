// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyApplicationsResponseBody body;

    public static ListMyApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyApplicationsResponse self = new ListMyApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListMyApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyApplicationsResponse setBody(ListMyApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyApplicationsResponseBody getBody() {
        return this.body;
    }

}
