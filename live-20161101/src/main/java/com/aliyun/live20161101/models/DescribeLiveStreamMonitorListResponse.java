// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMonitorListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamMonitorListResponseBody body;

    public static DescribeLiveStreamMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMonitorListResponse self = new DescribeLiveStreamMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMonitorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamMonitorListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamMonitorListResponse setBody(DescribeLiveStreamMonitorListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamMonitorListResponseBody getBody() {
        return this.body;
    }

}
