// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateIntantSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateIntantSiteMonitorResponseBody body;

    public static BatchCreateIntantSiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateIntantSiteMonitorResponse self = new BatchCreateIntantSiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateIntantSiteMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateIntantSiteMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateIntantSiteMonitorResponse setBody(BatchCreateIntantSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateIntantSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
