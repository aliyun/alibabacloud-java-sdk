// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportDownloadURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDataExportDownloadURLResponse setBody(GetDataExportDownloadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataExportDownloadURLResponseBody getBody() {
        return this.body;
    }

}
