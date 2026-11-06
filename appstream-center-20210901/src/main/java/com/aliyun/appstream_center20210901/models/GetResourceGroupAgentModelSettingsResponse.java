// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceGroupAgentModelSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceGroupAgentModelSettingsResponseBody body;

    public static GetResourceGroupAgentModelSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupAgentModelSettingsResponse self = new GetResourceGroupAgentModelSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupAgentModelSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupAgentModelSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupAgentModelSettingsResponse setBody(GetResourceGroupAgentModelSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupAgentModelSettingsResponseBody getBody() {
        return this.body;
    }

}
