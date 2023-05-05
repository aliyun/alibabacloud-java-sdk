// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDistributeAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDistributeAppsResponseBody body;

    public static BatchDistributeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDistributeAppsResponse self = new BatchDistributeAppsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDistributeAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDistributeAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDistributeAppsResponse setBody(BatchDistributeAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDistributeAppsResponseBody getBody() {
        return this.body;
    }

}
