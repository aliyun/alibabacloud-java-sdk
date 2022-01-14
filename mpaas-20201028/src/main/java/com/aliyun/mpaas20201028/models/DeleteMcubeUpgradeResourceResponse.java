// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeUpgradeResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcubeUpgradeResourceResponseBody body;

    public static DeleteMcubeUpgradeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeUpgradeResourceResponse self = new DeleteMcubeUpgradeResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeUpgradeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcubeUpgradeResourceResponse setBody(DeleteMcubeUpgradeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeUpgradeResourceResponseBody getBody() {
        return this.body;
    }

}
