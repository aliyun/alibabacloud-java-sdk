// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulScanTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVulScanTasksResponseBody body;

    public static ListVulScanTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVulScanTasksResponse self = new ListVulScanTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListVulScanTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVulScanTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVulScanTasksResponse setBody(ListVulScanTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVulScanTasksResponseBody getBody() {
        return this.body;
    }

}
