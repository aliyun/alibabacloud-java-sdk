// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCloudPermissionTemplateResponseBody body;

    public static DisableCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCloudPermissionTemplateResponse self = new DisableCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DisableCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCloudPermissionTemplateResponse setBody(DisableCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
