// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeDiskSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeDiskSizeResponseBody body;

    public static ResizeDiskSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskSizeResponse self = new ResizeDiskSizeResponse();
        return TeaModel.build(map, self);
    }

    public ResizeDiskSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeDiskSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeDiskSizeResponse setBody(ResizeDiskSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeDiskSizeResponseBody getBody() {
        return this.body;
    }

}
