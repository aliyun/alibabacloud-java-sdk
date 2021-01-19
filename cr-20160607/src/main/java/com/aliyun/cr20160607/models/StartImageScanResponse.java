// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class StartImageScanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static StartImageScanResponse build(java.util.Map<String, ?> map) throws Exception {
        StartImageScanResponse self = new StartImageScanResponse();
        return TeaModel.build(map, self);
    }

    public StartImageScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
