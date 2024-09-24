// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class BatchSetDesktopManagerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetDesktopManagerResponseBody body;

    public static BatchSetDesktopManagerResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDesktopManagerResponse self = new BatchSetDesktopManagerResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetDesktopManagerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetDesktopManagerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetDesktopManagerResponse setBody(BatchSetDesktopManagerResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetDesktopManagerResponseBody getBody() {
        return this.body;
    }

}
