// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeUpgradeTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListMcubeUpgradeTasksResponse setBody(ListMcubeUpgradeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeUpgradeTasksResponseBody getBody() {
        return this.body;
    }

}
