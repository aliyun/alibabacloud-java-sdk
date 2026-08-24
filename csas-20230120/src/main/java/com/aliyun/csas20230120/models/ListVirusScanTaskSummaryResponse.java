// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanTaskSummaryResponseBody body;

    public static ListVirusScanTaskSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskSummaryResponse self = new ListVirusScanTaskSummaryResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanTaskSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanTaskSummaryResponse setBody(ListVirusScanTaskSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanTaskSummaryResponseBody getBody() {
        return this.body;
    }

}
