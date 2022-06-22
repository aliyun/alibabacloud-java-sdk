// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PluginInstallWizardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PluginInstallWizardResponseBody body;

    public static PluginInstallWizardResponse build(java.util.Map<String, ?> map) throws Exception {
        PluginInstallWizardResponse self = new PluginInstallWizardResponse();
        return TeaModel.build(map, self);
    }

    public PluginInstallWizardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PluginInstallWizardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PluginInstallWizardResponse setBody(PluginInstallWizardResponseBody body) {
        this.body = body;
        return this;
    }
    public PluginInstallWizardResponseBody getBody() {
        return this.body;
    }

}
