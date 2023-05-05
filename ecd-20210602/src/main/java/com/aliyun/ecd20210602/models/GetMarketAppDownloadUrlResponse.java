// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetMarketAppDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMarketAppDownloadUrlResponseBody body;

    public static GetMarketAppDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMarketAppDownloadUrlResponse self = new GetMarketAppDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMarketAppDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMarketAppDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMarketAppDownloadUrlResponse setBody(GetMarketAppDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMarketAppDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
