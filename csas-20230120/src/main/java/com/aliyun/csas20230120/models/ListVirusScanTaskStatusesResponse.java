// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskStatusesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanTaskStatusesResponseBody body;

    public static ListVirusScanTaskStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskStatusesResponse self = new ListVirusScanTaskStatusesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanTaskStatusesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanTaskStatusesResponse setBody(ListVirusScanTaskStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanTaskStatusesResponseBody getBody() {
        return this.body;
    }

}
