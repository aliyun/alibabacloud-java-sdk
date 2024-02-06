// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeNebulaResourcesResponseBody body;

    public static ListMcubeNebulaResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeNebulaResourcesResponse self = new ListMcubeNebulaResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeNebulaResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeNebulaResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeNebulaResourcesResponse setBody(ListMcubeNebulaResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeNebulaResourcesResponseBody getBody() {
        return this.body;
    }

}
