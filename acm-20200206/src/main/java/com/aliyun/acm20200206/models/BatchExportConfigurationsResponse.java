// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchExportConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchExportConfigurationsResponseBody body;

    public static BatchExportConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchExportConfigurationsResponse self = new BatchExportConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchExportConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchExportConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchExportConfigurationsResponse setBody(BatchExportConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchExportConfigurationsResponseBody getBody() {
        return this.body;
    }

}
