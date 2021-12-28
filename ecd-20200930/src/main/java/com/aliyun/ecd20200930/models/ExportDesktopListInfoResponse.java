// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ExportDesktopListInfoResponse setBody(ExportDesktopListInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDesktopListInfoResponseBody getBody() {
        return this.body;
    }

}
