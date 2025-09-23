// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DownloadBiddingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadBiddingDocResponseBody body;

    public static DownloadBiddingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadBiddingDocResponse self = new DownloadBiddingDocResponse();
        return TeaModel.build(map, self);
    }

    public DownloadBiddingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadBiddingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadBiddingDocResponse setBody(DownloadBiddingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadBiddingDocResponseBody getBody() {
        return this.body;
    }

}
