// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkWebsiteScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MarkWebsiteScanResultResponseBody body;

    public static MarkWebsiteScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkWebsiteScanResultResponse self = new MarkWebsiteScanResultResponse();
        return TeaModel.build(map, self);
    }

    public MarkWebsiteScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkWebsiteScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkWebsiteScanResultResponse setBody(MarkWebsiteScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkWebsiteScanResultResponseBody getBody() {
        return this.body;
    }

}
