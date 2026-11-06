// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCloudPermissionTemplateResponseBody body;

    public static EnableCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCloudPermissionTemplateResponse self = new EnableCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public EnableCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCloudPermissionTemplateResponse setBody(EnableCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
