// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeUpgradeTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMcubeUpgradeTaskInfoResponseBody body;

    public static GetMcubeUpgradeTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeUpgradeTaskInfoResponse self = new GetMcubeUpgradeTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMcubeUpgradeTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcubeUpgradeTaskInfoResponse setBody(GetMcubeUpgradeTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeUpgradeTaskInfoResponseBody getBody() {
        return this.body;
    }

}
