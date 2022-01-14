// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListMcubeNebulaAppsResponse setBody(ListMcubeNebulaAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeNebulaAppsResponseBody getBody() {
        return this.body;
    }

}
