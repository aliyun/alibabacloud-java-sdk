// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeactivateVersionManagementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateVersionManagementResponseBody body;

    public static DeactivateVersionManagementResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateVersionManagementResponse self = new DeactivateVersionManagementResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateVersionManagementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateVersionManagementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateVersionManagementResponse setBody(DeactivateVersionManagementResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateVersionManagementResponseBody getBody() {
        return this.body;
    }

}
