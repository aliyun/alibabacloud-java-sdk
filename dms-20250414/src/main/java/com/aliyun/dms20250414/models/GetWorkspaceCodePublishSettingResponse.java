// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceCodePublishSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspaceCodePublishSettingResponseBody body;

    public static GetWorkspaceCodePublishSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceCodePublishSettingResponse self = new GetWorkspaceCodePublishSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceCodePublishSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceCodePublishSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceCodePublishSettingResponse setBody(GetWorkspaceCodePublishSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceCodePublishSettingResponseBody getBody() {
        return this.body;
    }

}
