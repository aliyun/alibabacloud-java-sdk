// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchImportConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchImportConfigurationsResponse setBody(BatchImportConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchImportConfigurationsResponseBody getBody() {
        return this.body;
    }

}
