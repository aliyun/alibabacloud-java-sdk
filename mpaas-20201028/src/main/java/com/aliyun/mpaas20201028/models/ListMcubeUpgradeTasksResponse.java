// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeUpgradeTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeUpgradeTasksResponseBody body;

    public static ListMcubeUpgradeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeUpgradeTasksResponse self = new ListMcubeUpgradeTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeUpgradeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeUpgradeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeUpgradeTasksResponse setBody(ListMcubeUpgradeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeUpgradeTasksResponseBody getBody() {
        return this.body;
    }

}
