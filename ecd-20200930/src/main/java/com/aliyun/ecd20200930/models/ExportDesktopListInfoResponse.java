// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportDesktopListInfoResponseBody body;

    public static ExportDesktopListInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopListInfoResponse self = new ExportDesktopListInfoResponse();
        return TeaModel.build(map, self);
    }

    public ExportDesktopListInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDesktopListInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportDesktopListInfoResponse setBody(ExportDesktopListInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDesktopListInfoResponseBody getBody() {
        return this.body;
    }

}
