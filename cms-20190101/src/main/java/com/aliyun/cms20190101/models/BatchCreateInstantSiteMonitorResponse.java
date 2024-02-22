// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateInstantSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateInstantSiteMonitorResponseBody body;

    public static BatchCreateInstantSiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateInstantSiteMonitorResponse self = new BatchCreateInstantSiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateInstantSiteMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateInstantSiteMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateInstantSiteMonitorResponse setBody(BatchCreateInstantSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateInstantSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
