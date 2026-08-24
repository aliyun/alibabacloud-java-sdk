// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanTasksResponseBody body;

    public static ListVirusScanTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTasksResponse self = new ListVirusScanTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanTasksResponse setBody(ListVirusScanTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanTasksResponseBody getBody() {
        return this.body;
    }

}
