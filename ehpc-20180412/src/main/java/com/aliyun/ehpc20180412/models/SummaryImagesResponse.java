// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SummaryImagesResponseBody body;

    public static SummaryImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        SummaryImagesResponse self = new SummaryImagesResponse();
        return TeaModel.build(map, self);
    }

    public SummaryImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SummaryImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SummaryImagesResponse setBody(SummaryImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public SummaryImagesResponseBody getBody() {
        return this.body;
    }

}
