// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateOnceSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateOnceSiteMonitorResponseBody body;

    public static BatchCreateOnceSiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateOnceSiteMonitorResponse self = new BatchCreateOnceSiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateOnceSiteMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateOnceSiteMonitorResponse setBody(BatchCreateOnceSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateOnceSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
