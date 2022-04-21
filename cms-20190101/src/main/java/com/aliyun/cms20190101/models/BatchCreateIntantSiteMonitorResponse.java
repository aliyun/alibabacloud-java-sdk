// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateIntantSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchCreateIntantSiteMonitorResponse setBody(BatchCreateIntantSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateIntantSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
