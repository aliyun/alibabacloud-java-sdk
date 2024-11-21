// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentKubeResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentKubeResourcesResponseBody body;

    public static ListEnvironmentKubeResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentKubeResourcesResponse self = new ListEnvironmentKubeResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentKubeResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentKubeResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentKubeResourcesResponse setBody(ListEnvironmentKubeResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentKubeResourcesResponseBody getBody() {
        return this.body;
    }

}
