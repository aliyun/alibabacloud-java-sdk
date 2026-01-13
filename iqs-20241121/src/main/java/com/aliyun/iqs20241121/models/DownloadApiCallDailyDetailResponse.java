// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadApiCallDailyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadApiCallDailyDetailResponseBody body;

    public static DownloadApiCallDailyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadApiCallDailyDetailResponse self = new DownloadApiCallDailyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DownloadApiCallDailyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadApiCallDailyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadApiCallDailyDetailResponse setBody(DownloadApiCallDailyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadApiCallDailyDetailResponseBody getBody() {
        return this.body;
    }

}
