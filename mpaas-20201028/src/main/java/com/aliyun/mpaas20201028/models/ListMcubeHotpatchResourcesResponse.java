// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeHotpatchResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeHotpatchResourcesResponseBody body;

    public static ListMcubeHotpatchResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeHotpatchResourcesResponse self = new ListMcubeHotpatchResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeHotpatchResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeHotpatchResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeHotpatchResourcesResponse setBody(ListMcubeHotpatchResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeHotpatchResourcesResponseBody getBody() {
        return this.body;
    }

}
