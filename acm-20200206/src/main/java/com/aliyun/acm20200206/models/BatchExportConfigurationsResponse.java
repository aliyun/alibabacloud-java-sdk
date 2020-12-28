// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchExportConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchExportConfigurationsResponse setBody(BatchExportConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchExportConfigurationsResponseBody getBody() {
        return this.body;
    }

}
