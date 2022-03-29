// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ScanOpenSourceComplianceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanOpenSourceComplianceResponseBody body;

    public static ScanOpenSourceComplianceResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanOpenSourceComplianceResponse self = new ScanOpenSourceComplianceResponse();
        return TeaModel.build(map, self);
    }

    public ScanOpenSourceComplianceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanOpenSourceComplianceResponse setBody(ScanOpenSourceComplianceResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanOpenSourceComplianceResponseBody getBody() {
        return this.body;
    }

}
