// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportDownloadURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataExportDownloadURLResponseBody body;

    public static GetDataExportDownloadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportDownloadURLResponse self = new GetDataExportDownloadURLResponse();
        return TeaModel.build(map, self);
    }

    public GetDataExportDownloadURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataExportDownloadURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataExportDownloadURLResponse setBody(GetDataExportDownloadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataExportDownloadURLResponseBody getBody() {
        return this.body;
    }

}
