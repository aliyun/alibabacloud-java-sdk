// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeUpgradeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteMcubeUpgradeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcubeUpgradeResourceResponse setBody(DeleteMcubeUpgradeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeUpgradeResourceResponseBody getBody() {
        return this.body;
    }

}
