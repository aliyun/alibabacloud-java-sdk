// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDbExportDownloadURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDbExportDownloadURLResponseBody body;

    public static GetDbExportDownloadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDbExportDownloadURLResponse self = new GetDbExportDownloadURLResponse();
        return TeaModel.build(map, self);
    }

    public GetDbExportDownloadURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDbExportDownloadURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDbExportDownloadURLResponse setBody(GetDbExportDownloadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDbExportDownloadURLResponseBody getBody() {
        return this.body;
    }

}
