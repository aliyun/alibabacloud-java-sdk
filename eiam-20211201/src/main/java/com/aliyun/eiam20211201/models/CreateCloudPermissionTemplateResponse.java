// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudPermissionTemplateResponseBody body;

    public static CreateCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPermissionTemplateResponse self = new CreateCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudPermissionTemplateResponse setBody(CreateCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
