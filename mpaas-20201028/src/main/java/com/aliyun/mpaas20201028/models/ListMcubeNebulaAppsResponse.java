// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeNebulaAppsResponseBody body;

    public static ListMcubeNebulaAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeNebulaAppsResponse self = new ListMcubeNebulaAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeNebulaAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeNebulaAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeNebulaAppsResponse setBody(ListMcubeNebulaAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeNebulaAppsResponseBody getBody() {
        return this.body;
    }

}
