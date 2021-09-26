// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ScanSensitiveDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanSensitiveDataResponseBody body;

    public static ScanSensitiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanSensitiveDataResponse self = new ScanSensitiveDataResponse();
        return TeaModel.build(map, self);
    }

    public ScanSensitiveDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanSensitiveDataResponse setBody(ScanSensitiveDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanSensitiveDataResponseBody getBody() {
        return this.body;
    }

}
