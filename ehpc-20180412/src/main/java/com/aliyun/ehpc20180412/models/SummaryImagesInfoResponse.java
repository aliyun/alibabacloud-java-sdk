// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SummaryImagesInfoResponseBody body;

    public static SummaryImagesInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SummaryImagesInfoResponse self = new SummaryImagesInfoResponse();
        return TeaModel.build(map, self);
    }

    public SummaryImagesInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SummaryImagesInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SummaryImagesInfoResponse setBody(SummaryImagesInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SummaryImagesInfoResponseBody getBody() {
        return this.body;
    }

}
