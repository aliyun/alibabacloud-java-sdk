// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeUpgradePackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMcubeUpgradePackagesResponseBody body;

    public static ListMcubeUpgradePackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeUpgradePackagesResponse self = new ListMcubeUpgradePackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeUpgradePackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeUpgradePackagesResponse setBody(ListMcubeUpgradePackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeUpgradePackagesResponseBody getBody() {
        return this.body;
    }

}
