// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudPermissionTemplateResponseBody body;

    public static GetCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudPermissionTemplateResponse self = new GetCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudPermissionTemplateResponse setBody(GetCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
