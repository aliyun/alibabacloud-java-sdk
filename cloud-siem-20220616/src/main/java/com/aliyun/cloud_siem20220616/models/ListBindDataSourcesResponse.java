// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListBindDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBindDataSourcesResponseBody body;

    public static ListBindDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindDataSourcesResponse self = new ListBindDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListBindDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindDataSourcesResponse setBody(ListBindDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindDataSourcesResponseBody getBody() {
        return this.body;
    }

}
