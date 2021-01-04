// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadUserTotalFlowReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadUserTotalFlowReportResponseBody body;

    public static DownloadUserTotalFlowReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadUserTotalFlowReportResponse self = new DownloadUserTotalFlowReportResponse();
        return TeaModel.build(map, self);
    }

    public DownloadUserTotalFlowReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadUserTotalFlowReportResponse setBody(DownloadUserTotalFlowReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadUserTotalFlowReportResponseBody getBody() {
        return this.body;
    }

}
