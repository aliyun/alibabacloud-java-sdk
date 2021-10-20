// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataUpdateProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanDataUpdateProjectResponseBody body;

    public static ScanDataUpdateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanDataUpdateProjectResponse self = new ScanDataUpdateProjectResponse();
        return TeaModel.build(map, self);
    }

    public ScanDataUpdateProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanDataUpdateProjectResponse setBody(ScanDataUpdateProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanDataUpdateProjectResponseBody getBody() {
        return this.body;
    }

}
