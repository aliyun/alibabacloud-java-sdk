// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchImportConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchImportConfigurationsResponseBody body;

    public static BatchImportConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchImportConfigurationsResponse self = new BatchImportConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchImportConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchImportConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchImportConfigurationsResponse setBody(BatchImportConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchImportConfigurationsResponseBody getBody() {
        return this.body;
    }

}
