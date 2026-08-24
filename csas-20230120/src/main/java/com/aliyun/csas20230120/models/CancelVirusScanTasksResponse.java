// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CancelVirusScanTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelVirusScanTasksResponseBody body;

    public static CancelVirusScanTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelVirusScanTasksResponse self = new CancelVirusScanTasksResponse();
        return TeaModel.build(map, self);
    }

    public CancelVirusScanTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelVirusScanTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelVirusScanTasksResponse setBody(CancelVirusScanTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelVirusScanTasksResponseBody getBody() {
        return this.body;
    }

}
