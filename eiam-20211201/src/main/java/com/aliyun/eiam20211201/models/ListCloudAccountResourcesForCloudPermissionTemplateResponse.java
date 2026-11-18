// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountResourcesForCloudPermissionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody body;

    public static ListCloudAccountResourcesForCloudPermissionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountResourcesForCloudPermissionTemplateResponse self = new ListCloudAccountResourcesForCloudPermissionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponse setBody(ListCloudAccountResourcesForCloudPermissionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody getBody() {
        return this.body;
    }

}
