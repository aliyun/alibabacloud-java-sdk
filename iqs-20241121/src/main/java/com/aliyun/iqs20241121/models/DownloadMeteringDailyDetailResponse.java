// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadMeteringDailyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadMeteringDailyDetailResponseBody body;

    public static DownloadMeteringDailyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadMeteringDailyDetailResponse self = new DownloadMeteringDailyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DownloadMeteringDailyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadMeteringDailyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadMeteringDailyDetailResponse setBody(DownloadMeteringDailyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadMeteringDailyDetailResponseBody getBody() {
        return this.body;
    }

}
