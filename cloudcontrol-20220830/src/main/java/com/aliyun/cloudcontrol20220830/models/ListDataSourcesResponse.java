// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSourcesResponseBody body;

    public static ListDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponse self = new ListDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourcesResponse setBody(ListDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourcesResponseBody getBody() {
        return this.body;
    }

}
