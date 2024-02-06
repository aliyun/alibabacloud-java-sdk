// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeUpgradeTaskResponseBody body;

    public static CreateMcubeUpgradeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradeTaskResponse self = new CreateMcubeUpgradeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeUpgradeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeUpgradeTaskResponse setBody(CreateMcubeUpgradeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeUpgradeTaskResponseBody getBody() {
        return this.body;
    }

}
