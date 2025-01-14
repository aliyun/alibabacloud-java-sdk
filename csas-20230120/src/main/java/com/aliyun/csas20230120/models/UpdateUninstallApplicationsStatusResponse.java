// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUninstallApplicationsStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUninstallApplicationsStatusResponseBody body;

    public static UpdateUninstallApplicationsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUninstallApplicationsStatusResponse self = new UpdateUninstallApplicationsStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUninstallApplicationsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUninstallApplicationsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUninstallApplicationsStatusResponse setBody(UpdateUninstallApplicationsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUninstallApplicationsStatusResponseBody getBody() {
        return this.body;
    }

}
