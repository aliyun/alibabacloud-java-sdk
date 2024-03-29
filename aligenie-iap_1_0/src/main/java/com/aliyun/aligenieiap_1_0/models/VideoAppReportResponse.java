// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class VideoAppReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoAppReportResponseBody body;

    public static VideoAppReportResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoAppReportResponse self = new VideoAppReportResponse();
        return TeaModel.build(map, self);
    }

    public VideoAppReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoAppReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoAppReportResponse setBody(VideoAppReportResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoAppReportResponseBody getBody() {
        return this.body;
    }

}
