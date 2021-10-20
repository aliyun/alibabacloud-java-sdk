// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataQueryProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanDataQueryProjectResponseBody body;

    public static ScanDataQueryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanDataQueryProjectResponse self = new ScanDataQueryProjectResponse();
        return TeaModel.build(map, self);
    }

    public ScanDataQueryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanDataQueryProjectResponse setBody(ScanDataQueryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanDataQueryProjectResponseBody getBody() {
        return this.body;
    }

}
