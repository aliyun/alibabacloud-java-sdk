// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UploadReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadReportResponseBody body;

    public static UploadReportResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadReportResponse self = new UploadReportResponse();
        return TeaModel.build(map, self);
    }

    public UploadReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadReportResponse setBody(UploadReportResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadReportResponseBody getBody() {
        return this.body;
    }

}
