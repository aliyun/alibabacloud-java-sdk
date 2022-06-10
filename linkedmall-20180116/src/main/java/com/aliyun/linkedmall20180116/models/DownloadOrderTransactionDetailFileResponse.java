// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadOrderTransactionDetailFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadOrderTransactionDetailFileResponseBody body;

    public static DownloadOrderTransactionDetailFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadOrderTransactionDetailFileResponse self = new DownloadOrderTransactionDetailFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadOrderTransactionDetailFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadOrderTransactionDetailFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadOrderTransactionDetailFileResponse setBody(DownloadOrderTransactionDetailFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadOrderTransactionDetailFileResponseBody getBody() {
        return this.body;
    }

}
