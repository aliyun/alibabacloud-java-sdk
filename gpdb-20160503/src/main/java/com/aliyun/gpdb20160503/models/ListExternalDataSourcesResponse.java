// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListExternalDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalDataSourcesResponseBody body;

    public static ListExternalDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalDataSourcesResponse self = new ListExternalDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalDataSourcesResponse setBody(ListExternalDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalDataSourcesResponseBody getBody() {
        return this.body;
    }

}
