// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudPermissionTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudPermissionTemplatesResponseBody body;

    public static ListCloudPermissionTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudPermissionTemplatesResponse self = new ListCloudPermissionTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudPermissionTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudPermissionTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudPermissionTemplatesResponse setBody(ListCloudPermissionTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudPermissionTemplatesResponseBody getBody() {
        return this.body;
    }

}
