// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListRemoteADBDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRemoteADBDataSourcesResponseBody body;

    public static ListRemoteADBDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemoteADBDataSourcesResponse self = new ListRemoteADBDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListRemoteADBDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRemoteADBDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRemoteADBDataSourcesResponse setBody(ListRemoteADBDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRemoteADBDataSourcesResponseBody getBody() {
        return this.body;
    }

}
