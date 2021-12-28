// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDesktopGroupInfoResponseBody body;

    public static ExportDesktopGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopGroupInfoResponse self = new ExportDesktopGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public ExportDesktopGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDesktopGroupInfoResponse setBody(ExportDesktopGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDesktopGroupInfoResponseBody getBody() {
        return this.body;
    }

}
