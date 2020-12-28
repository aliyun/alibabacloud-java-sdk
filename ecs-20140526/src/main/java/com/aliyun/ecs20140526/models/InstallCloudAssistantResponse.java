// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallCloudAssistantResponseBody body;

    public static InstallCloudAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAssistantResponse self = new InstallCloudAssistantResponse();
        return TeaModel.build(map, self);
    }

    public InstallCloudAssistantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallCloudAssistantResponse setBody(InstallCloudAssistantResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallCloudAssistantResponseBody getBody() {
        return this.body;
    }

}
