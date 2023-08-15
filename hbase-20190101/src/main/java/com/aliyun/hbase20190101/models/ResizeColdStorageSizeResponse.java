// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeColdStorageSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeColdStorageSizeResponseBody body;

    public static ResizeColdStorageSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeColdStorageSizeResponse self = new ResizeColdStorageSizeResponse();
        return TeaModel.build(map, self);
    }

    public ResizeColdStorageSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeColdStorageSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeColdStorageSizeResponse setBody(ResizeColdStorageSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeColdStorageSizeResponseBody getBody() {
        return this.body;
    }

}
