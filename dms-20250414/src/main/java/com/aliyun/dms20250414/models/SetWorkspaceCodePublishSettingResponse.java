// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SetWorkspaceCodePublishSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWorkspaceCodePublishSettingResponseBody body;

    public static SetWorkspaceCodePublishSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWorkspaceCodePublishSettingResponse self = new SetWorkspaceCodePublishSettingResponse();
        return TeaModel.build(map, self);
    }

    public SetWorkspaceCodePublishSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWorkspaceCodePublishSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWorkspaceCodePublishSettingResponse setBody(SetWorkspaceCodePublishSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWorkspaceCodePublishSettingResponseBody getBody() {
        return this.body;
    }

}
