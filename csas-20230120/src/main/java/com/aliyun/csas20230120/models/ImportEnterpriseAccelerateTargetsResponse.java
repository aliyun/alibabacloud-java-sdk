// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ImportEnterpriseAccelerateTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportEnterpriseAccelerateTargetsResponseBody body;

    public static ImportEnterpriseAccelerateTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportEnterpriseAccelerateTargetsResponse self = new ImportEnterpriseAccelerateTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ImportEnterpriseAccelerateTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportEnterpriseAccelerateTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportEnterpriseAccelerateTargetsResponse setBody(ImportEnterpriseAccelerateTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportEnterpriseAccelerateTargetsResponseBody getBody() {
        return this.body;
    }

}
