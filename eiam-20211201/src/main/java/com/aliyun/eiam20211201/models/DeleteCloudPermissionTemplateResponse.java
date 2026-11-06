// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudPermissionTemplateResponseBody body;

    public static DeleteCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudPermissionTemplateResponse self = new DeleteCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudPermissionTemplateResponse setBody(DeleteCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
