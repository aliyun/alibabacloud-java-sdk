// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ScanMobileAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanMobileAppResponseBody body;

    public static ScanMobileAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanMobileAppResponse self = new ScanMobileAppResponse();
        return TeaModel.build(map, self);
    }

    public ScanMobileAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanMobileAppResponse setBody(ScanMobileAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanMobileAppResponseBody getBody() {
        return this.body;
    }

}
