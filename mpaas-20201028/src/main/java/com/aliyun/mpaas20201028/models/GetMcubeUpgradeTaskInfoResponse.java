// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeUpgradeTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetMcubeUpgradeTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcubeUpgradeTaskInfoResponse setBody(GetMcubeUpgradeTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeUpgradeTaskInfoResponseBody getBody() {
        return this.body;
    }

}
