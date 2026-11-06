// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudPermissionTemplateResponseBody body;

    public static UpdateCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudPermissionTemplateResponse self = new UpdateCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudPermissionTemplateResponse setBody(UpdateCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
