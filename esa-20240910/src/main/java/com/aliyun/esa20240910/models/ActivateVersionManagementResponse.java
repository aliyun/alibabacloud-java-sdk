// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ActivateVersionManagementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateVersionManagementResponseBody body;

    public static ActivateVersionManagementResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateVersionManagementResponse self = new ActivateVersionManagementResponse();
        return TeaModel.build(map, self);
    }

    public ActivateVersionManagementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateVersionManagementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateVersionManagementResponse setBody(ActivateVersionManagementResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateVersionManagementResponseBody getBody() {
        return this.body;
    }

}
