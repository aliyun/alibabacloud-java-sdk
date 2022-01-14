// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DownloadMPCDExcelByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadMPCDExcelByIdResponseBody body;

    public static DownloadMPCDExcelByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadMPCDExcelByIdResponse self = new DownloadMPCDExcelByIdResponse();
        return TeaModel.build(map, self);
    }

    public DownloadMPCDExcelByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadMPCDExcelByIdResponse setBody(DownloadMPCDExcelByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadMPCDExcelByIdResponseBody getBody() {
        return this.body;
    }

}
